package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.*;

public class MyMedia extends BasePage {

    private String title = "//a[@title='%s']";//Bohemian Rhapsody (The Original Soundtrack)/Rammstein
    private String titleSinger = "//a[@title='%s']";
    private String trackContextMenu = "//button[@type='button' and contains(@aria-label,'%s')]";//Родина
    private String albumAction = "//div[@data-testid='action-bar-row']/child::button[@aria-label='%s']";//Удалить из медиатеки//Добавить в медиатеку
    private String subscriptionActionForSinger = "//button[contains(text(),'%s')]";//Подписаться/подписка
    private String actionWithTracks = "//span[contains(text(),'%s')]";//Добавить в любимые треки/Удалить из любимых треков
    @FindBy(xpath = "//span[contains(text(),'Исполнители')]")
    private WebElement singerSection;

    @FindBy(xpath = "//span[contains(text(),'Альбомы')]")
    private WebElement albumSection;
    @FindBy(xpath = "//span[contains(text(),'Любимые треки')]")
    private WebElement favoriteTrackSection;

//    @FindBy(xpath = "//div[@data-testid='action-bar-row']/child::button[@aria-label='']")
//    private WebElement addAlbum;

    //@FindBy(xpath )


    //  @FindBy(xpath = "//span[contains(text(),'Добавить в любимые треки')]")



    public MyMedia searchBox() {

        return this;
    }

    public MyMedia addAlbum(String addAlbum) {
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(albumAction, addAlbum))).click();
        return this;
    }

    public MyMedia addSinger(String action) {
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(subscriptionActionForSinger, action))).click();
        return this;
    }

    public MyMedia addSong(String trackName, String addTrack) {
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(trackContextMenu, trackName))).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(actionWithTracks, addTrack))).click();
        return this;
    }

    public MyMedia deleteAlbum(String title, String deleteAlbum) {
        waiter.waitUntilElementToBeClickable(albumSection).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(this.title, title))).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(albumAction, deleteAlbum))).click();
        return this;
    }

    public MyMedia deleteSinger(String title, String deleteSinger) {
        waiter.waitUntilElementToBeClickable(singerSection).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(this.title, title))).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(subscriptionActionForSinger, deleteSinger))).click();
        return this;
    }
    public MyMedia deleteTrack(String title, String trackName, String deleteTrack){
        waiter.waitUntilElementToBeClickable(favoriteTrackSection).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(trackContextMenu, trackName))).click();
        waiter.waitUntilVisibilityOfElementLocated(By.xpath(format(actionWithTracks, deleteTrack))).click();
        return this;
    }
}
