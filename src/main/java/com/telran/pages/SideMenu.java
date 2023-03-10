package com.telran.pages;

import com.telran.pages.AlertsFramesWindowsPage.AlertsPage;
import com.telran.pages.AlertsFramesWindowsPage.BrowserWindowsPage;
import com.telran.pages.AlertsFramesWindowsPage.FramesPage;
import com.telran.pages.AlertsFramesWindowsPage.NestedFramesPage;
import com.telran.pages.BookStore.BookStorePage;
import com.telran.pages.BookStore.LoginPage;
import com.telran.pages.BookStore.ProfilePage;
import com.telran.pages.Elements.*;
import com.telran.pages.Interactions.DroppablePage;
import com.telran.pages.Widgets.MenuPage;
import com.telran.pages.Widgets.SelectMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenu extends PageBase {
    public SideMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]")
    WebElement loginPageLink;

    public LoginPage openLoginPage() {
        clickWithJSExecutor(loginPageLink, 0, 200);
        wait(500);
        return new LoginPage(driver);
    }

    @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")
    WebElement alertsPageLink;

    public AlertsPage openAlertsPage() {
        clickWithJSExecutor(alertsPageLink, 0, 200);
        return new AlertsPage(driver);
    }

    @FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]")
    WebElement profilePageLink;

    public ProfilePage openProfilePage() {
        clickWithJSExecutor(profilePageLink, 0,300);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Book Store']")
    WebElement bookStorePageLink;

    public BookStorePage openBookStorePage() {
        wait(1000);
        clickWithJSExecutor(bookStorePageLink, 0, 500);
        return new BookStorePage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindowsLink;
    public BrowserWindowsPage openBrowserWindowsPage() {
        click(browserWindowsLink);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement framesPage;

    public FramesPage openFramesPage() {
        clickWithJSExecutor(framesPage, 0, 250);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFramesPage;

    public NestedFramesPage openNestedFramesPage() {
        clickWithJSExecutor(nestedFramesPage, 0, 250);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenuPageLink;

    public SelectMenuPage openSelectMenu() {
        clickWithJSExecutor(selectMenuPageLink, 0, 400);
        wait(1000);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBoxPageLink;

    public TextBoxPage openTextBox() {
        click(textBoxPageLink);
        return new TextBoxPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttonsPageLink;

    public ButtonsPage openButtons() {
        clickWithJSExecutor(buttonsPageLink, 0, 200);
        wait(1000);
        return new ButtonsPage(driver);
    }


    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement uploadAndDownloadPageLink;

    public UploadAndDownloadPage openUploadandDownloadPage() {
        clickWithJSExecutor(uploadAndDownloadPageLink, 0, 300);
        return new UploadAndDownloadPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImagesLink;

    public BrokenLinksImagesPage openBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImagesLink, 0, 250);
        return new BrokenLinksImagesPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppableLink;

    public DroppablePage openDroppablePage() {
        clickWithJSExecutor(droppableLink, 0, 350);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menuPageLink;

    public MenuPage openMenu() {
        clickWithJSExecutor(menuPageLink, 0, 350);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Radio Button']")
    WebElement radioButtonLink;

    public RadioButtonPage openRadioButton() {
        clickWithJSExecutor(radioButtonLink, 0, 300);

        return new RadioButtonPage(driver);


    }
}
