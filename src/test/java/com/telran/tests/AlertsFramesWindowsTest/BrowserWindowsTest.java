package com.telran.tests.AlertsFramesWindowsTest;

import com.telran.pages.AlertsFramesWindowsPage.BrowserWindowsPage;
import com.telran.pages.HomePage;
import com.telran.pages.SideMenu;
import com.telran.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends TestBase {

    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).openAlertsFrameWindowsPage();
        new SideMenu(driver).openBrowserWindowsPage();
    }

    @Test
    public void clickOnNewTabTest() {
        new BrowserWindowsPage(driver).openNewTab();
        Assert.assertTrue( new BrowserWindowsPage(driver).getNewPageHeading().contains("sample") );
    }

    @Test
    public void clickOnNewWindowTest() {
        new BrowserWindowsPage(driver).openNewWindow();
        Assert.assertTrue( new BrowserWindowsPage(driver).getNewPageHeading().contains("sample") );
    }

    @Test
    public void clickOnNewWindowMessageTest() {
        new BrowserWindowsPage(driver).openNewWindowMessage();
        Assert.assertTrue( new BrowserWindowsPage(driver).getMessageWindowBody().contains("Knowledge") );
    }
}