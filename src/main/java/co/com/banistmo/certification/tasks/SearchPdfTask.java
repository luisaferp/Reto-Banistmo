package co.com.banistmo.certification.tasks;

import co.com.banistmo.certification.userinterfaces.BanistmoUrlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.certification.userinterfaces.BanistmoUrlPage.*;

public class SearchPdfTask implements Task {
    private BanistmoUrlPage banistmoUrlPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ENTENDIDO),
                Click.on(BTN_PRODUCTOS_Y_SERVICIOS),
                Click.on(BTN_DEPOSITOS)
        );
    }

    public static SearchPdfTask businessAccount() {
        return Tasks.instrumented(SearchPdfTask.class);
    }
}