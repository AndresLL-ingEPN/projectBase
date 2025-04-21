package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.AcountUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewAcount implements Task {
    public static NewAcount nueva() {
        return instrumented(NewAcount.class);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AcountUI.LINK_NEW_ACOUNT),
                Click.on(AcountUI.BTN_NEW_ACOUNT)
        );
    }
}
