package co.com.banistmo.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchToTab implements Interaction {
    private final int tabIndex;

    public SwitchToTab(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabIndex < 0 || tabIndex >= tabs.size()){
            throw new IllegalArgumentException("Tabs Invalido: " + tabIndex);
        }
        driver.switchTo().window(tabs.get(tabIndex));
    }

    public static SwitchToTab atIndex(int index){
        return new SwitchToTab(index);
    }
}
