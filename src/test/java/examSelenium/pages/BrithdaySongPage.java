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

    public void selectMonth() {
        monthElement.selectByValue("7");
    }

    public void selectDay() {
        dayElement.selectByValue("25");
    }

    public void selectYear() {
        yearElement.selectByValue("1999");
    }

    public void searchSong(){
        searchButton.click();
    }

    public String takeResult() {
        return songName.findElement(By.tagName("strong")).getText();
    }
}
