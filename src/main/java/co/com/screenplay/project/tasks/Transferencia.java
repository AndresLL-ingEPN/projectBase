package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.TransferUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Transferencia implements Task {
    private final String amount;

    public Transferencia(String amount) {
        this.amount = amount;
    }
    public static Transferencia deMonto(String amount) {
        return instrumented(Transferencia.class, amount);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TransferUI.URL_TRANSFER),
                Enter.theValue(amount).into(TransferUI.TXT_AMOUNT),
                Click.on(TransferUI.BTN_FROM_ACCOUNT),
                SelectFromOptions.byIndex(0).from(TransferUI.BTN_FROM_ACCOUNT),
                Click.on(TransferUI.BTN_TO_ACCOUNT),
                SelectFromOptions.byIndex(1).from(TransferUI.BTN_TO_ACCOUNT),
                Click.on(TransferUI.BTN_TRANSFER)
        );
    }
}
