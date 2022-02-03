package com.spotify.www.common.helper;

import org.openqa.selenium.WebElement;

import java.util.List;

public final class ElementHelper {
private ElementHelper(){}

    public static  boolean isElementPresent(List<String> expectedElements, List<WebElement> actualElements) {
        boolean check = false;
        for (String expectedElement : expectedElements) {
            check = false;
            for (WebElement actualElement : actualElements) {
                if (expectedElement.equals(actualElement.getText().trim()) && actualElement.isDisplayed()) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("\"" + expectedElement + "\" no user data!!!");
                return false;
            }
        }
        return check;
    }
    public static boolean isElementNotNullNotEmpty(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (element == null || element.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
