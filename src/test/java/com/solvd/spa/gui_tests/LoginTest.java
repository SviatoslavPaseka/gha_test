package com.solvd.spa.gui_tests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.spa.pages.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest implements IAbstractTest {
    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
    public void successfulLoginTest() {
        final String emailTest = "kpitya01@gmail.com";
        final String passTest = "768124zzXX#";

        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        homePage.openLoginMenu();

        homePage.inputRegistrationDataWithClick(emailTest, passTest);

        //Assert.assertTrue(homePage.isPageOpened(), "Logging failed!");
    }
}