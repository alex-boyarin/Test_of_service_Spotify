package com.spotify.www.model.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyMedia extends BasePage {
    private String searchPattern = "//section[@aria-label='Лучший результат']//a[@title='Bohemian Rhapsody']";

    @FindBy(xpath = "//span[contains(text(),'Плейлисты')]")
    private WebElement playlist;

    @FindBy(xpath = "//span[contains(text(),'Исполнители')]")
    private WebElement singer;

    @FindBy(xpath = "//span[contains(text(),'Альбомы')]")
    private WebElement album;

    @FindBy(xpath = "//button[contains(text(),'Создать плейлист')]")
    private WebElement createPlaylist;

    @FindBy(xpath = "//a[contains(text(),'Найти исполнителей')]")
    private WebElement findSinger;

    @FindBy(xpath = "//a[contains(text(),'Найти альбомы')]")
    private WebElement findAlbum;

    @FindBy(xpath = "//form[@role='search']/input")
    WebElement searchBox;

    public MyMedia findAlbum() throws InterruptedException {
        Thread.sleep(3000);
        waiter.waitUntilElementToBeClickable(findAlbum).click();
        searchBox();
        return this;
    }

    public MyMedia searchBox() throws InterruptedException {
        Thread.sleep(3000);
        waiter.waitUntilElementToBeVisible(searchBox).sendKeys("Bohemian Rhapsody");
        Thread.sleep(3000);
        waiter.waitUntilVisibilityOfElementLocated(By.xpath("//section[@aria-label='Лучший результат']//a[@title='Bohemian Rhapsody']"))
                .click();
        return this;
    }
}
