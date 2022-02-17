package com.spotify.www.stepDefs.ui;

import com.spotify.www.model.ui.pages.user_pages.MyMedia;
import com.spotify.www.model.ui.pages.user_pages.Search;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class MediaStepsDefs {
    UserPage userPage = new UserPage();
    Search search = new Search();
    MyMedia myMedia = new MyMedia();

    @And("User click section search")
    public void userClickSectionSearch() {
        userPage.searchSection();
    }

    @And("User enters {string}")
    public void userEnters(String text) {
        search.searchMusic(text);
    }

    @And("User click section {string}")
    public void userClickSection(String bestResult) {
        search.searchResult(bestResult);
    }

    @And("User click button add {string}")
    public void userClickButtonAdd(String addAlbum) {
        myMedia.addAlbum(addAlbum);
    }

    @And("User click section my media")
    public void userClickSectionMyMedia() {
        userPage.myMediaSection();
    }

    @And("User click section album")
    public void userClickSectionAlbum() {
        myMedia.albumSection();
    }

    @Then("User should see list")
    public void userShouldSeeList() {
        Assertions.assertTrue(myMedia.mediaContainerIsNotEmpty());
    }

    @Then("User chooses {string} click {string}")
    public void userChoosesClick(String title, String deleteAlbum) {
        myMedia.deleteAlbum(title, deleteAlbum);
    }


    @And("User click button subscribe {string}")
    public void userClickButtonSubscribe(String addSinger) {
        myMedia.addSinger(addSinger);
    }

    @And("User click section singer")
    public void userClickSectionSinger() {
        myMedia.singerSection();
    }

    @Then("User chooses {string} click cancel {string}")
    public void userChoosesClickCancel(String titleSinger, String deleteSinger) {
        myMedia.deleteSinger(titleSinger, deleteSinger);
    }

    @And("User click button adds {string} to favorite track {string}")
    public void userClickButtonAddsToFavoriteTrack(String trackName, String addTrack) {
        myMedia.addSong(trackName, addTrack);
    }

    @And("User click section my favorite track")
    public void userClickSectionMyFavoriteTrack() {
        myMedia.myFavoriteSection();
    }

    @Then("User should see listTracks")
    public void userShouldSeeListTracks() {
        myMedia.listTracksIsNotEmpty();
    }

    @Then("User select from list {string} click remove from {string}")
    public void userSelectFromListClickRemove(String trackName, String deleteTrack) {
        myMedia.deleteTrack(trackName, deleteTrack);
    }
}
