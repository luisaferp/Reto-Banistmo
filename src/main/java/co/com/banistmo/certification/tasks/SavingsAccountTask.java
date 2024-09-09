package co.com.banistmo.certification.tasks;

import co.com.banistmo.certification.interactions.ImplicityWaitBanistmo;
import co.com.banistmo.certification.interactions.SwitchToTab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.certification.userinterfaces.BanistmoUrlPage.*;

public class SavingsAccountTask implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CUENTA_AHORRO_COMERCIAL),
                Click.on(BTN_DOCUMENTOS),
                ImplicityWaitBanistmo.time(2),
                Click.on(BTN_PDF_DOCUMENTOS),
                ImplicityWaitBanistmo.time(3),
                SwitchToTab.atIndex(1),
                ImplicityWaitBanistmo.time(5)
        );

    }

    public static SavingsAccountTask commercial() {
        return Tasks.instrumented(SavingsAccountTask.class);
    }
}

