package test.automation.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.MobileBy;


import io.appium.java_client.TouchAction;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverPool {
    private static AndroidDriver driver;


    public static AndroidDriver create() {
        String appiumUrl = "http://0.0.0.0:4723/wd/hub/";
        driver = null;

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 5 API 28");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/appfix5_5.apk");


        try {
            driver = new AndroidDriver(new URL(appiumUrl), caps);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static void pressBack() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public static void scrollDown() {
        MobileBy.ByAndroidUIAutomator scrollTo = new MobileBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"
        );

        WebElement element = driver.findElement(scrollTo);
        // Lakukan sesuatu dengan elemen yang ditemukan (misalnya, klik atau lainnya)
    }
    public static void tapByCoordinates(int x, int y) {
        new TouchAction(driver)
                .tap(PointOption.point(x, y))
                .perform();
    }
    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void pressKeyboardKey(AndroidKey key) {
        driver.pressKey(new KeyEvent(key));
    }
    public static void hideKeyboard() {
        driver.hideKeyboard();
    }
    public static void swipeLeft() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.8);
        int endX = (int) (size.width * 0.2);
        int startY = size.height / 2;

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }

    public static void swipeRight() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.2);
        int endX = (int) (size.width * 0.8);
        int startY = size.height / 2;

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }
}