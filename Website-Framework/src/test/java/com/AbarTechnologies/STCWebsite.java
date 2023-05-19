package com.AbarTechnologies;

import com.AbarTechnologies.pages.BasePage;
import com.AbarTechnologies.pages.NavHeader;
import com.AbarTechnologies.pages.NavSwitcher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class STCWebsite extends BasePage {

    public NavHeader navHeader;
    public NavSwitcher navSwitcher;


    @FindBy(className = "chat-hint-clear")
    private WebElement clearHelpButton;
    private String currentLanguage;

    public STCWebsite() {
        navHeader = new NavHeader();
        navSwitcher = new NavSwitcher();

    }

    public String getCurrentLanguage() {
        return currentLanguage;
    }

    public void setCurrentLanguage(String currentLanguage) {
        this.currentLanguage = currentLanguage;
    }

    public void clickOnClearHelpButton() {
        clearHelpButton.click();
    }

    public boolean areElementsHorizontallySortedDependentOnLanguage(WebElement firstElement, WebElement secondElement) {
        if (currentLanguage.equals("en"))
            return areElementsHorizontallySorted(firstElement, secondElement);
        else
            return areElementsHorizontallySorted(secondElement, firstElement);
    }

    public boolean areElementsHorizontallySorted(WebElement firstElement, WebElement secondElement) {
        return (firstElement.getLocation().x < secondElement.getLocation().x);
    }
}
