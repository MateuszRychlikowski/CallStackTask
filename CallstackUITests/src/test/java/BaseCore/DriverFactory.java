package BaseCore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
    public static AndroidDriver<AndroidElement> CreateAndroidDriverForService(AppiumDriverLocalService appiumDriverLocalService)
    {
        DesiredCapabilities appCapabilities= new DesiredCapabilities();
        appCapabilities.setCapability("platformName","Android");
        appCapabilities.setCapability("App","C:\\SRC\\CallStackTask\\react-native-qa-task\\android\\app\\build\\outputs\\apk\\release\\app-release.apk");
        appCapabilities.setCapability("AndroidPlatformVersion","10");
        appCapabilities.setCapability("AndroidDeviceName","R58M33HBPNF");
        appCapabilities.setCapability("AndroidDeviceUdid","samsung SM-G975F");

        return new AndroidDriver<AndroidElement>(appiumDriverLocalService,appCapabilities);
    }

    public static AppiumDriverLocalService CreateAppiumLocalService()
    {
        return new AppiumServiceBuilder()
                .build();
    }
}
