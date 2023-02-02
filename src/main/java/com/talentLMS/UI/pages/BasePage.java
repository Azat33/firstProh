package com.talentLMS.UI.pages;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebElementActions elementActions = new WebElementActions();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
