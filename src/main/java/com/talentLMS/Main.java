package com.talentLMS;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.pages.LoginPage;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ConfigReader.getProperty("browser"));

        Driver.getDriver().get("https://digitalnomads.talentlms.com/index");
        LoginPage loginPage = new LoginPage();
        WebElementActions webElementsActions = new WebElementActions();
//
//        Driver.getDriver().get("https://nambafood.kg/");
//        Thread.sleep(3000);
//        Driver.closeDriver();
//        WebElement element = null;

//



    }
}