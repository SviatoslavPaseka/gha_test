package com.solvd.spa.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenuComponent extends AbstractUIObject {

    public HeaderMenuComponent(WebDriver driver) {
        super(driver);
    }

    public HeaderMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//header[@id='header']/div/div/button")
    private ExtendedWebElement burgerButton;

    @FindBy(id = "anchor")
    private ExtendedWebElement homeLinks;

    @FindBy(id = "topsearch-text")
    private ExtendedWebElement topsearchInput;

    public void clickBurgerButton() {
        burgerButton.click();
    }


}
