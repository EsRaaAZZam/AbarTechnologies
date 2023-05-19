package com.AbarTechnologies.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavSwitcher extends BasePage {

    @FindBy(id = "translation-btn")
    private WebElement languageSwitcherButton;


    public WebElement getLanguageSwitcherButton() {
        return languageSwitcherButton;
    }

    public void switchLanguage() {
        languageSwitcherButton.click();
    }

    public boolean isLanguageButtonText(String languageButtonText) {
        return languageSwitcherButton.getText().equals(languageButtonText);
    }

    public void switchLanguageTo(String preferredLanguage) {
        switch (preferredLanguage) {
            case "en":
                if (isLanguageButtonText("English")) {
                    switchLanguage();
                }
                break;
            case "ar":
                if (isLanguageButtonText("العربيه") || isLanguageButtonText("العربية")) {
                    switchLanguage();
                }
                break;
            default:
                break;
        }
    }
}
