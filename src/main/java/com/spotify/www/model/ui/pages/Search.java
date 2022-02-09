package com.spotify.www.model.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage {

    @FindBy(xpath = "//div[@data-testid='action-bar-row']/child::button[@aria-label='Добавить в медиатеку']")
    private WebElement addAlbum;

    @FindBy(xpath = "//button[contains(text(),'Подписаться')]")
    private WebElement addSinger;

    private By bestResult = By.xpath("//section[@aria-label='Лучший результат']//a[@title='Bohemian Rhapsody (The Original Soundtrack)']");
    private By contextMenu = By.xpath("//button[@type='button' and contains(@aria-label,'Родина')]");

    @FindBy(xpath = "//span[contains(text(),'Добавить в любимые треки')]")
    private WebElement addToFavoriteTracks;

    @FindBy(xpath = "//form[@role='search']/input")
    private WebElement searchBox;


    public Search searchMusic() {
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys("Bohemian Rhapsody (The Original Soundtrack)");
        return this;
    }

    public Search searchResult() {
        waiter.waitUntilVisibilityOfElementLocated(bestResult)
                .click();
        return this;
    }

    public Search addAlbum() {
        waiter.waitUntilElementToBeClickable(addAlbum).click();
        return this;
    }

    public Search addSinger() {
        waiter.waitUntilElementToBeClickable(addSinger).click();
        return this;
    }

    public Search addSong() {
        waiter.waitUntilVisibilityOfElementLocated(contextMenu).click();
        waiter.waitUntilElementToBeClickable(addToFavoriteTracks).click();
        return this;
    }

}
