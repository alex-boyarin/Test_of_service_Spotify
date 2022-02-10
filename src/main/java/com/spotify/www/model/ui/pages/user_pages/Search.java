package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.checkerframework.checker.index.qual.SubstringIndexUnknown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage {


    @FindBy(xpath = "//form[@role='search']/input")
    private WebElement searchBox;

    private String result = "//section[@aria-label='%s']//a";//Лучший результат

    public Search searchMusic(String string) {
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys(string);//"Bohemian Rhapsody (The Original Soundtrack)"//"Rammstein"//"Родина"
        return this;
    }

    public MyMedia searchResult(String bestResult) {
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(String.format(result, bestResult)))
                .click();
        return new MyMedia();
    }


}
