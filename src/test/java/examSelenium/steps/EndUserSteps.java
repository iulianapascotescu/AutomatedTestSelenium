package examSelenium.steps;

import examSelenium.pages.BestSongsOfAllTimePage;
import examSelenium.pages.BrithdaySongPage;
import examSelenium.pages.WikipediaPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    BrithdaySongPage birthdaySongPage;
    BestSongsOfAllTimePage bestSongsOfAllTimePage;
    WikipediaPage wikipediaPage;

    @Step
    public void open_birthday_songs_page() {
        birthdaySongPage.open();
    }

    @Step
    public void selectDate(int day, int month, int year){
        birthdaySongPage.selectMonth(month);
        birthdaySongPage.selectDay(day);
        birthdaySongPage.selectYear(year);
        birthdaySongPage.searchSong();
    }

    @Step
    public String takeResultedSong() {
        return birthdaySongPage.takeResult();
    }

    @Step
    public void open_best_songs_of_all_time_page() {
        bestSongsOfAllTimePage.open();
    }

    @Step
    public String searchInList(String songName){
        return bestSongsOfAllTimePage.searchSong(songName);
    }

    @Step
    public void open_wikipedia_page() {
        wikipediaPage.open();
    }

    @Step
    public void search_song(String song){
        wikipediaPage.enter_song(song);
        wikipediaPage.lookup_song();
    }

    @Step
    public void accessLink(){
        wikipediaPage.access_link();
    }

}
