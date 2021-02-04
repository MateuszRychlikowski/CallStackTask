package BaseCore;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class BasePage {

    protected BasePage(AndroidDriver<AndroidElement> androidDriver)
        {
            this.androidDriver=androidDriver;
        }
        private AndroidElement androidElement;
        private AndroidDriver<AndroidElement> androidDriver;

    protected void SetTextInTextBoxBy(By selector, String text)
    {
        SendKeysToElementBy(selector, text);
    }

    protected void ClickButtonBy(By searchButton)
    {
        ClickElementBy(searchButton);
    }

    private void SendKeysToElementBy(By selectorBy, String text) {
        try
        {
            androidDriver.findElement(selectorBy).sendKeys(text);
        }
        catch(NullPointerException e)
        {

        }
    }

    private void ClickElementBy(By selectorBy) {
        try
        {
            androidDriver.findElement(selectorBy).click();
        }
        catch(NullPointerException e)
        {

        }
    }
}
