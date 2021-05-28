package examSelenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://playback.fm/birthday-song")
public class BrithdaySongPage extends PageObject {

    @FindBy(id = "month")
    private WebElementFacade monthElement;

    @FindBy(id = "day")
    private WebElementFacade dayElement;

    @FindBy(id = "year")
    private WebElementFacade yearElement;

    @FindBy(className = "findSong")
    private WebElementFacade searchButton;

    @FindBy(id = "id01")
    private WebElementFacade songName;

    public void selectMonth(int month) {
        monthElement.selectByValue(String.valueOf(month));
    }

    public void selectDay(int day) {
        dayElement.selectByValue(String.valueOf(day));
    }

    public void selectYear(int year) {
        yearElement.selectByValue(String.valueOf(year));
    }

    public void searchSong(){
        searchButton.click();
    }

    public String takeResult() {
        return songName.findElement(By.tagName("strong")).getText();
    }
}
