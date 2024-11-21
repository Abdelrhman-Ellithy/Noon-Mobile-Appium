package utility;


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

public class videoRecorder {
    public static void startRecording(AndroidDriver driver) {
        driver.startRecordingScreen();
    }
    public static void stopAndSaveRecording(AndroidDriver driver,String fileName) {
        var video = driver.stopRecordingScreen();
        byte[] videoData = Base64.getDecoder().decode(video);
        try (FileOutputStream fos = new FileOutputStream(new File(fileName))) {
            fos.write(videoData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}