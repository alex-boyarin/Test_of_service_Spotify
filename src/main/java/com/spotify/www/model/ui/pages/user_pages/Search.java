package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage {



    @FindBy(xpath = "//form[@role='search']/input")
    private WebElement searchBox;

    private By bestResult = By.xpath("//section[@aria-label='Лучший результат']//a");

    public Search searchMusic() {
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys("Bohemian Rhapsody (The Original Soundtrack)");
        return this;
    }

    public Search searchSinger() {
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys("Rammstein");
        return this;
    }

    public Search searchSong() {
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys("Родина");
        return this;
    }

    public MyMedia searchResult() {
        waiter.waitUntilVisibilityOfElementLocated(bestResult)
                .click();
        return new MyMedia();
    }


}
