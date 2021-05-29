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
    public void select_date(int day, int month, int year){
        birthdaySongPage.select_month(month);
        birthdaySongPage.select_day(day);
        birthdaySongPage.select_year(year);
        birthdaySongPage.search_song();
    }

    @Step
    public String take_resulted_song() {
        return birthdaySongPage.take_resulted_song_name();
    }

    @Step
    public void open_best_songs_of_all_time_page() {
        bestSongsOfAllTimePage.open();
    }

    @Step
    public String search_in_list_of_best_songs(String songName){
        return bestSongsOfAllTimePage.search_song_in_the_list_of_best_songs(songName);
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
    public void access_link(){
        wikipediaPage.access_link();
    }

}
