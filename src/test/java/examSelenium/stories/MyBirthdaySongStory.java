package examSelenium.stories;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import examSelenium.steps.EndUserSteps;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class MyBirthdaySongStory {

    private static final int SECONDS_TO_KEEP_PAGE_OPEN = 1000;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps student;

    @Test
    public void searching_for_my_birthday_song() {

        // the student goes to the birthday songs page
        student.open_birthday_songs_page();

        // he retrieves his corresponding birthday song (full name)
        // ...

        student.select_date(7, 12, 1999);
        String result = student.take_resulted_song();
        String name = result.split(" by ")[0];
        String author = result.split(" by ")[1];

        // he open the article with the top 100 songs of all time
        student.open_best_songs_of_all_time_page();

        // he checks if his songs is in the top (simply tries to match the full name)
        // and then prints the appropriate message in the console
        // ...
        String songName = "‘" + name + "‘ — " + author;
        System.out.println(student.search_in_list_of_best_songs(songName));

        // he goes on Wikipedia
        student.open_wikipedia_page();

        // he searches for the song there as well and opens the first result
        // ...
        student.search_song(songName);
        student.access_link();

        // keep the page open al little longer after the process is over
        waitForIt(SECONDS_TO_KEEP_PAGE_OPEN);

    }

    private void waitForIt(int secondsToWait)
    {
        try {
            TimeUnit.SECONDS.sleep(secondsToWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
