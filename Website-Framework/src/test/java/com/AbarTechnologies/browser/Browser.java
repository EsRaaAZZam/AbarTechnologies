package com.AbarTechnologies.browser;

import com.AbarTechnologies.STCWebsite;
import com.AbarTechnologies.driver.WebDriverHandler;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    private final WebDriver webDriver = WebDriverHandler.getWebDriver();

    public STCWebsite stcWeb;

    public Browser() {
        stcWeb = new STCWebsite();
    }

    public void sendLink(String link) {
        webDriver.get(link);
    }

    public void swipeTo(WebElement targetElement) {
        Actions action = new Actions(webDriver);
        action.dragAndDropBy(targetElement, 200, 0).build().perform();
    }

    public int getXCoordinate(WebElement element) {
        Point elementPoint = element.getLocation();
        return elementPoint.getX();
    }


    public boolean waitTillTextToBePresentInElement(WebElement elementToBeDisplayed, String textToBeCompared) {
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.
                    textToBePresentInElement(elementToBeDisplayed, textToBeCompared));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
