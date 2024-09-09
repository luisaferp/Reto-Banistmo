package co.com.banistmo.certification.stepdefinitions;


import co.com.banistmo.certification.questions.IsPdfDownloaded;
import co.com.banistmo.certification.questions.VerifyPdf;
import co.com.banistmo.certification.tasks.OpenBrowserTask;
import co.com.banistmo.certification.tasks.SavingsAccountTask;
import co.com.banistmo.certification.tasks.SearchPdfTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.hamcrest.Matchers;

public class ProductosServiciosStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario ingresa a Banistmo Web")
    public void queElUsuarioIngresaABanistmoWeb() {
        OnStage.theActorCalled("usuario").wasAbleTo(
                OpenBrowserTask.url()
        );
    }

    @When("selecciono productos y servicios, luego depositos")
    public void seleccionoProductosYServiciosLuegoDepositos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchPdfTask.businessAccount()
        );
    }

    @And("elijo cuenta de ahorro comercial para descargar el pdf")
    public void elijoCuentaDeAhorroComercialParaDescargarElPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SavingsAccountTask.commercial()
        );
    }

    @Then("verifico la informacion contenida en el pdf")
    public void verificoLaInformacionContenidaEnElPdf() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                IsPdfDownloaded.ofCurrentTab(), Matchers.containsString("CONTRATO-UNICO-OCT-2022.pdf")));
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                Ensure.that(VerifyPdf.file("CONTRATO UNICO DE PRODUCTOS Y SERVICIOS BANISTMO")).isTrue()
//        );
    }
}
