package Base;

import Ellithium.core.base.NonBDDSetup;
import Ellithium.core.driver.DriverFactory;
import Ellithium.core.driver.DriverType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
public class Base extends NonBDDSetup {
    protected AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Xiaomi Redmi Note 8");
        options.setAppPackage("com.noon.buyerapp");
        options.setAppActivity("com.noon.buyerapp.MainActivity");
        options.setCapability("appium:noReset", true);
        options.setCapability("appium:fullReset", false);
        driver= DriverFactory.getNewDriver(DriverType.Android,new URL("http://127.0.0.1:4723"),options);
    }

    @AfterTest
    public void tareDown(){
        DriverFactory.quitDriver();
    }
}
