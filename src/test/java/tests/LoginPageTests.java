package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactsPage;
import pages.LoginPage;

public class LoginPageTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        logger.info("Starting login test");
        //String language = System.getProperty("language");
        String language = "English";

        LoginPage myLoginPage = new LoginPage(driver);
        ContactsPage contactsPage = myLoginPage.login("test@gmail.com", "test@gmail.com");
        sleep();
        contactsPage.selectLanguage(language);
        sleep();
        Assert.assertEquals(contactsPage.getContacts(language).getText(), ContactsPage.getContactWord(language));
        Assert.assertTrue(searchInPageSource("Contacts List"));
        logger.info("Finished login test");
        contactsPage.logout();
    }

    @Test
    public void loginNegativeTest() {
        logger.info("Starting negative login test");

        LoginPage myLoginPage = new LoginPage(driver);
        myLoginPage.loginNegative("test@gmail.com", "123456789");
        sleep();
        Assert.assertEquals(myLoginPage.registerLink.getText(), "Register new Account");
        
    }

    @Test
    public void openAndCloseNewContactDialog() {

       logger.info("Starting open and close Add new contact");

       ContactsPage myContactsPage = new ContactsPage(driver);
       sleep();

       logger.info("Finished open and close Add new contact");
    }
}