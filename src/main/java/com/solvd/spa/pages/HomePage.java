package com.solvd.spa.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    @FindBy(id = "login-active")
    private ExtendedWebElement loginLink;

    @FindBy(id = "email")
    private ExtendedWebElement emailInput;

    @FindBy(id = "upass")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log in']")
    private ExtendedWebElement loginButton;

    public void openLoginMenu(){
        loginLink.click();
    }

    public void inputRegistrationDataWithClick(String email, String password) {
        emailInput(email);
        passwordInput(password);
        loginClick();
    }

    private void loginClick() {
        loginButton.click();
    }

    private void passwordInput(String password) {
        passwordInput.type(password);
    }

    private void emailInput(String email) {
        emailInput.type(email);
    }
}
