package com.AbarTechnologies.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavHeader extends BasePage {


    @FindBy(id = "arrow")
    private WebElement accountIcon;

    @FindBy(id = "sa-contry-flag")
    private WebElement saudiaArabiaCountry;

    @FindBy(id = "kw-contry-lable")
    private WebElement kuwaitCountry;

    @FindBy(id = "bh-contry-flag")
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
        saudiaArabiaCountry.click();
    }


}
