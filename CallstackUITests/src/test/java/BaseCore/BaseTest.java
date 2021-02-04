package BaseCore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected AndroidDriver<AndroidElement> androidDriver;
    protected AppiumDriverLocalService appiumLocalService;


    @Before
    public void SetUp()
    {
        if(appiumLocalService !=null)
        {
            appiumLocalService.stop();
        }
        appiumLocalService = DriverFactory.CreateAppiumLocalService();
        appiumLocalService.start();

      if (androidDriver !=null)
      {
          androidDriver.quit();
      }
        androidDriver =DriverFactory.CreateAndroidDriverForService(appiumLocalService);
      androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void TearDown()
    {
        androidDriver.closeApp();
        androidDriver.quit();
        appiumLocalService.stop();
    }

}
