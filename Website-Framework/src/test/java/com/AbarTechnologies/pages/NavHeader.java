package com.AbarTechnologies.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavHeader extends BasePage {


    @FindBy(id = "arrow")
    private WebElement accountIcon;

    public WebElement getLitePackage() {
        return litePackage;
    }

    public WebElement getClasicPackage() {
        return clasicPackage;
    }

    public WebElement getPremiumPackahe() {
        return premiumPackahe;
    }

    public WebElement getCurrencyLite() {
        return currencyLite;
    }

    public WebElement getCurrencyClassic() {
        return currencyClassic;
    }

    public WebElement getCurrencyPremium() {
        return currencyPremium;
    }

    public WebElement getSaudiaArabiaCountry() {
        return saudiaArabiaCountry;
    }

    public WebElement getKuwaitCountry() {
        return kuwaitCountry;
    }

    public WebElement getBahrainCountry() {
        return bahrainCountry;
    }

    @FindBy(id = "name-lite")
    private WebElement litePackage;
    @FindBy(id = "name-classic")
    private WebElement clasicPackage;
    @FindBy(id = "name-premium")
    private WebElement premiumPackahe;
    @FindBy(id = "currency-lite")

    private WebElement currencyLite;
    @FindBy(id = "currency-classic")
    private WebElement currencyClassic;

    @FindBy(id = "currency-premium")
    private WebElement currencyPremium;



    @FindBy(id = "sa")
    private WebElement saudiaArabiaCountry;

    @FindBy(id = "kw")
    private WebElement kuwaitCountry;

    @FindBy(id = "bh")
    private WebElement bahrainCountry;


    public WebElement getBahrainsCountry() {
        return bahrainCountry;
    }


    public WebElement getAccountIcon() {
        return accountIcon;
    }


    public void clickOnCounyrIcon() {
        accountIcon.click();
    }


    public void clickOnKuwaitCountry() {
        kuwaitCountry.click();
    }

    public void clickOnSaudiCountry() {
        saudiaArabiaCountry.click();
    }

    public void clickOnBahrainCountry() {
        bahrainCountry.click();
    }

    public void clickOnCountry() {
        accountIcon.click();
    }


}
