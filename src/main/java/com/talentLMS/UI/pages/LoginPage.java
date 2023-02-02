package com.talentLMS.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Azat Karapashov
 */

public class LoginPage extends BasePage {



    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeBtn;

    @FindBy(id = "tl-cms-nav-login")
    public WebElement loginBtn;

    @FindBy(css = ".avatar-square")
    public WebElement digitalNomadsLogo;

    @FindBy(id = "tl-shared-username")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitLoginBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement loginErrMess;

    @FindBy(xpath = "(//span[@class='help-inline'])[1]")
    public WebElement emptyUsernameFieldErrMess;

    @FindBy(xpath = "(//span[contains(text(),'Password')]")
    public WebElement emptyPasswordFieldErrMess;

    @FindBy(xpath = "(.//a[@class='link-color'])[1]")
    public WebElement forgotYourPasswordBtn;

    @FindBy(xpath = "//h3[@class='tl-auth-form--handle-display active']")
    public WebElement resetPasswordWindow;

    public LoginPage clickLoginBtn(){
        elementActions.click(loginBtn);
        return this;
    }

    public LoginPage fillUpUsernameAndPassword(String userName, String password){
        clickLoginBtn();
        elementActions.sendKeys(usernameInput,userName)
                .sendKeys(passwordInput,password)
                .click(submitLoginBtn);
        return this;
    }
}
