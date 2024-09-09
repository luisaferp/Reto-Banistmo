package co.com.banistmo.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/productos_y_servicios.feature",
    tags = "",
    glue = "co.com.banistmo.certification.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags {
}
