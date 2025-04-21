package co.com.screenplay.project.tasks;

import co.com.screenplay.project.model.ModelUser;
import co.com.screenplay.project.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.HomeUI.LINK_REGISTER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FuntionsElementsTasks implements Task {

    private final ModelUser data;

    public FuntionsElementsTasks(ModelUser data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LINK_REGISTER, isEnabled()),
                Click.on(LINK_REGISTER),
                Enter.theValue(data.getFirst_Name()).into(HomeUI.TXT_FIRSTNAME),
                Enter.theValue(data.getLast_Name()).into(HomeUI.TXT_LASTNAME),
                Enter.theValue(data.getAddress()).into(HomeUI.TXT_ADDRESS),
                Enter.theValue(data.getCity()).into(HomeUI.TXT_CITY),
                Enter.theValue(data.getState()).into(HomeUI.TXT_STATE),
                Enter.theValue(data.getZip_Code()).into(HomeUI.TXT_ZIPCODE),
                Enter.theValue(data.getPhone()).into(HomeUI.TXT_PHONE),
                Enter.theValue(data.getSSN()).into(HomeUI.TXT_SSN),
                Enter.theValue(data.getUsername()).into(HomeUI.LABEL_USERNAME),
                Enter.theValue(data.getPassword()).into(HomeUI.LABEL_PASSWORD),
                Enter.theValue(data.getConfirm()).into(HomeUI.LABEL_CONFIRM),
                Click.on(HomeUI.BTN_REGISTER)
        );
    }

    public static FuntionsElementsTasks withInformation(ModelUser data){
        return instrumented(FuntionsElementsTasks.class, data);
    }
}
