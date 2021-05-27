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

    public boolean searchSong(String song){
        for(int i=1;i<=50;i++)
        {
            String header = "header-slide-"+i;
            String name = list.findElement(By.id("slide_"+i)).findElement(By.id(header)).getText();
            if(name.equals(song))
                return true;
        }
        return false;
    }


}
