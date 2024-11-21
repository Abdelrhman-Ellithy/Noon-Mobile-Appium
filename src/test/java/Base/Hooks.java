package Base;

import Ellithium.Utilities.generators.TestDataGenerator;
import Ellithium.core.driver.DriverFactory;
import Ellithium.core.driver.DriverType;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.*;
import utility.videoRecorder;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    @Before
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Xiaomi Redmi Note 8");
        options.setAppPackage("com.noon.buyerapp");
        options.setAppActivity("com.noon.buyerapp.MainActivity");
        options.setCapability("appium:noReset", true);
        options.setCapability("appium:fullReset", false);
        DriverFactory.getNewDriver(DriverType.Android,new URL("http://127.0.0.1:4723"),options);
        videoRecorder.startRecording(DriverFactory.getCurrentDriver());
    }

    @After(order = 1)
    public void saveRecordVideo(Scenario scenario){
        String fileName="Test-Output/VideoRecords/"+scenario.getName()+TestDataGenerator.getTimeStamp()+".mp4";
        videoRecorder.stopAndSaveRecording(DriverFactory.getCurrentDriver(),fileName);
    }
}
