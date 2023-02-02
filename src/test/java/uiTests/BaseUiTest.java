package uiTests;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest {


    LoginPage loginPage;
    WebElementActions webElementsActions;

    @BeforeClass
    public void setUpUiTest(){
        loginPage = new LoginPage();
        webElementsActions = new WebElementActions();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();


    }
}
