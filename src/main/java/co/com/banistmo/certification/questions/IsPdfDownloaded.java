package co.com.banistmo.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;


public class IsPdfDownloaded implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver= BrowseTheWeb.as(actor).getDriver();
        return driver.getCurrentUrl();
    }

    public static IsPdfDownloaded ofCurrentTab() {
        return new IsPdfDownloaded();
    }
}
