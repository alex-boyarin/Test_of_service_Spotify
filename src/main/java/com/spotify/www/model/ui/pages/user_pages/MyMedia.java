package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyMedia extends BasePage {

    private String titleAlbum = "//a[@title='Bohemian Rhapsody (The Original Soundtrack)']";

    private By contextMenu = By.xpath("//button[@type='button' and contains(@aria-label,'Родина')]");

    @FindBy(xpath = "//span[contains(text(),'Плейлисты')]")
    private WebElement playlist;

    @FindBy(xpath = "//span[contains(text(),'Исполнители')]")
    private WebElement singer;

    @FindBy(xpath = "//span[contains(text(),'Альбомы')]")
    private WebElement album;

    @FindBy(xpath = "//div[@data-testid='action-bar-row']/child::button[@aria-label='Добавить в медиатеку']")
    private WebElement addAlbum;

    @FindBy(xpath = "//button[contains(text(),'Подписаться')]")
    private WebElement addSinger;

    @FindBy(xpath = "//span[contains(text(),'Добавить в любимые треки')]")
    private WebElement addToFavoriteTracks;

    @FindBy(xpath = "//div[@data-testid='action-bar-row']/child::button[@aria-label='Удалить из медиатеки']")
    private WebElement deleteAlbum;

    public MyMedia deleteAlbum() {
        waiter.waitUntilElementToBeClickable(album).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(titleAlbum)).click();
        waiter.waitUntilElementToBeClickable(deleteAlbum).click();
        return this;
    }

    public MyMedia searchBox() throws InterruptedException {

        return this;
    }

    public MyMedia addAlbum() {
        waiter.waitUntilElementToBeClickable(addAlbum).click();
        return this;
    }

    public MyMedia addSinger() {
        waiter.waitUntilElementToBeClickable(addSinger).click();
        return this;
    }

    public MyMedia addSong() {
        waiter.waitUntilVisibilityOfElementLocated(contextMenu).click();
        waiter.waitUntilElementToBeClickable(addToFavoriteTracks).click();
        return this;
    }
}
