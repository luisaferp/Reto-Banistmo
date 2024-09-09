package co.com.banistmo.certification.tasks;

import co.com.banistmo.certification.userinterfaces.BanistmoUrlPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowserTask implements Task {
    private BanistmoUrlPage banistmoUrlPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(banistmoUrlPage)
        );
    }

    public static OpenBrowserTask url() {
        return Tasks.instrumented(OpenBrowserTask.class);
    }
}
