package examSelenium.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://en.wikipedia.org/wiki/Main_Page")
public class WikipediaPage extends PageObject {
    @FindBy(id = "searchInput")
    private WebElementFacade searchBox;

    @FindBy(id = "searchButton")
    private WebElementFacade lookupButton;

    public void lookup_song() {
        lookupButton.click();
    }

    public void enter_song(String song) {
        searchBox.type(song);
    }

    public void access_link() {
        WebElementFacade parentDiv = find(By.className("searchresults"));
        WebElementFacade ul = parentDiv.find(By.tagName("ul"));
        List<WebElementFacade> list = ul.thenFindAll(By.tagName("li"));
        list.get(0).then(By.className("mw-search-result-heading")).then(By.tagName("a")).click();
    }

}
