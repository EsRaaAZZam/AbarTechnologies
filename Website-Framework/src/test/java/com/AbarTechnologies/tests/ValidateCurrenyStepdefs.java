package com.AbarTechnologies.tests;

import com.AbarTechnologies.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ValidateCurrenyStepdefs extends BaseTest {


    @When("choose Country Bahrain")
    public void userClicksCountry() {
        browser.stcWeb.navHeader.clickOnBahrainCountry();
    }


    @When("website is opened and user need it to be in language {string}")
    public void websiteIsOpenedAndUserNeedItToBeInLanguage(String preferredLanguage) throws InterruptedException {
        BasePage.waitUntilPageIsLoaded();
        browser.stcWeb.navSwitcher.switchLanguageTo(preferredLanguage);
        browser.stcWeb.setCurrentLanguage(preferredLanguage);
        Thread.sleep(2000);
    }

    @When("wait for page to load")
    public void waitForPageToLoad() {
        BasePage.waitUntilPageIsLoaded();
    }


    @When("choose Country Saudia Arabia")
    public void chooseCountrySaudiaArabia() {
        browser.stcWeb.navHeader.clickOnSaudiCountry();
    }

    @When("choose Country Kuwait Arabia")
    public void chooseCountryKuwaitArabia() {
        browser.stcWeb.navHeader.clickOnKuwaitCountry();
    }

    @When("user click on country icon on sunscriber STC screen")
    public void userClickOnCountryIconOnSunscriberSTCScreen() {
        browser.stcWeb.navHeader.clickOnCountry();

    }






    @Then("{string} with price {string} and {string} with price {string} and {string} with price {string}")
    public void withPriceAndWithPriceAndWithPrice(    String litePackage, String clasicPackage, String premiumPackage, String litePrice, String classicPrice, String premiumPrice) {
        Assert.assertTrue(browser.stcWeb.navHeader.getLitePackage().isDisplayed());
        Assert.assertTrue(browser.stcWeb.navHeader.getClasicPackage().isDisplayed());
        Assert.assertTrue(browser.stcWeb.navHeader.getPremiumPackahe().isDisplayed());

        Assert.assertEquals(litePrice, browser.stcWeb.navHeader.getCurrencyLite().getText());
        Assert.assertEquals(clasicPackage, browser.stcWeb.navHeader.getCurrencyClassic().getText()
        );
        Assert.assertEquals(premiumPrice, browser.stcWeb.navHeader.getCurrencyPremium().getText());
    }

}

