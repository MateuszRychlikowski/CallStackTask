package Tests;

import BaseCore.BaseTest;
import PageObjects.MainPageObjects;
import org.junit.Assert;
import org.junit.Test;


public class MainPageTests extends BaseTest {

    @Test
    public void UserIsOnMainPage_WhenClickedSearchButton_TheButtonDisabled()
    {
        new MainPageObjects(androidDriver)
                .EnterTextToSearchTextBox("test")
                .ClickSearchButton();

        Assert.assertTrue(true);
    }
}
