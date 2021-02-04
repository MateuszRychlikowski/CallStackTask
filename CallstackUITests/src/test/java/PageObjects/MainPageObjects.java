package PageObjects;

import BaseCore.BasePage;
import Selectors.MainPageSelectors;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainPageObjects extends BasePage {
    public MainPageObjects(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }

    public MainPageObjects EnterTextToSearchTextBox(String text)
    {
        SetTextInTextBoxBy(MainPageSelectors.TextBox,text);
        return this;
    }

    public void ClickSearchButton()
    {
        ClickButtonBy(MainPageSelectors.SearchButton);
    }

}
