package examSelenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.yecht.Data;

@DefaultUrl("https://www.thedelite.com/best-songs-of-all-time-according-to-critics-and-fans")
public class BestSongsOfAllTimePage extends PageObject {

    @FindBy(className = "slide")
    private WebElementFacade list;

    public String search_song_in_the_list_of_best_songs(String song){
        for(int i=50;i>=1;i--)
        {
            String header = "header-slide-"+(50-i+1);
            String name = find(By.id(header)).getText();
            if(name.contains(song))
                return "My song is on top 50 best songs of all time on number " + i;
        }
        return "My song is not on top 50 best songs of all time";
    }


}
