package Pages;

import Ellithium.Utilities.interactions.AndroidDriverActions;
import com.github.javafaker.App;
import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import java.util.List;

public class SearchPage {
    private AndroidDriver driver;
    private AndroidDriverActions driverActions;
    By searchBar= AppiumBy.className("android.widget.EditText");
    By sort=AppiumBy.accessibilityId("Sort");
    By filter=AppiumBy.accessibilityId("Filter");

    By resultName=AppiumBy.xpath("//android.widget.TextView[string-length(@text) > 40]");

    By priceLowToHigh=By.xpath("//*[contains(@text, 'Low to High')]");
    By resultPrice=AppiumBy.xpath("//android.widget.TextView[contains(@text,\"EGP\")]");
    By brand=AppiumBy.accessibilityId("Brand");

    By deliverTo= AppiumBy.androidUIAutomator("new UiSelector().text(\"Deliver to 367C+76 - Zamalek - Cairo Governorate\")");

    public SearchPage(AndroidDriver driver){
        this.driver=driver;
        driverActions=new AndroidDriverActions(driver);
    }
    public void searchItem(String itemName) {
        driverActions.clickOnElement(searchBar);
        driverActions.sendData(searchBar,itemName);
    }
    public void clickEnter(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public String getTextInSearchField(){
        return driver.findElement(searchBar).getAttribute("text");
    }

    public void clickSortBy(String sortBy) {
         String sortByLower=sortBy.toLowerCase();
        driverActions.clickOnElement(sort);
         switch (sortByLower){
             case "price low to high":
                 driverActions.clickOnElement(priceLowToHigh);
                break;
             default:
                 break;
         }
    }
    public List<String> getResultsPrice() {
        driverActions.waitForVisibilityOfAllElements(resultPrice);
        List<String> prices=driverActions.getTextFromMultipleElements(resultPrice,5,300);
        return prices;
    }
    public List<String> getResultsNames(){
        driverActions.waitForVisibilityOfAllElements(resultName);
        List<String>itemsName=driverActions.getTextFromMultipleElements(resultName,10,200);
        return itemsName;
    }
    public void clickHP()  {
        driverActions.clickOnElement(brand,5,300);
        driverActions.waitForElementToBeVisible(By.xpath("//*[contains(@text, 'HP')]"));
        driverActions.clickOnElement(By.xpath("//*[contains(@text, 'HP')]"));
        driverActions.clickOnElement(By.xpath("//*[contains(@text, 'APPLY')]"));
    }
    public void returnHome(){
        boolean visible=false;
        while (!visible){
            try {
                driverActions.waitForElementToBeVisible(deliverTo);
                visible=driver.findElement(deliverTo).isDisplayed();
            }
            catch (Exception e){
                driverActions.navigateBack();
            }
        }
    }
}
