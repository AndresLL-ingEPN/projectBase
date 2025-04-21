package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.RegisterUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logout implements Task {

    public static Logout ahora() {
        return instrumented(Logout.class);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterUI.BTN_LOGOUT)
        );
    }
}

