package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTests extends BaseUiTest{


    @Test(description = "Verify user can not login with invalid username")
    public void loginWithInvalidUsernameTest(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("testName","HelloAAAAsds");
        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
        webElementsActions.pause(5000);
    }

    @Test(description = "Verify user has not entered data in the field \"USERNAME OR EMAIL\"")
    public void loginWithEmptyUsernameTest(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("","HelloAAAAsds");
        String expectedErrMes = "'Username or email' is required";
        assertEquals(loginPage.emptyUsernameFieldErrMess.getText(), expectedErrMes);
        webElementsActions.pause(5000);
    }

    @Test(description = "Verify user has not entered data in the field \"PASSWORD\"")
    public void loginWithEmptyPasswordTest(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("testName","");
        String expectedErrMes = "'Password' is required";
        assertEquals(loginPage.emptyUsernameFieldErrMess.getText(), expectedErrMes);
        webElementsActions.pause(5000);
    }

//    @Test(description = "Verify user has not entered data in the field"")
//    public void forgotYourPasswordBtnTest(){
//        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//        String expectedPageTitle = "Reset password";
//        String actualPageTitle = Driver.getDriver().getTitle();
//        loginPage.forgotYourPasswordBtn.click();
//        assertEquals(actualPageTitle, );
//        webElementsActions.pause(5000);
//    }

}
