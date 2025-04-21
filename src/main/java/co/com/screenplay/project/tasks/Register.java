package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.RegisterUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {
    private final String nombre;
    private final String apellido;
    private final String direccion;
    private final String ciudad;
    private final String estado;
    private final String zip;
    private final String telefono;
    private final String ssn;
    private final String usuario;
    private final String password;

    public Register(String nombre, String apellido, String direccion, String ciudad, String estado,
                    String zip, String telefono, String ssn, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.zip = zip;
        this.telefono = telefono;
        this.ssn = ssn;
        this.usuario = usuario;
        this.password = password;
    }

    public static Register conDatos(String nombre, String apellido, String direccion, String ciudad,
                                    String estado, String zip, String telefono, String ssn,
                                    String usuario, String password) {
        return instrumented(Register.class, nombre, apellido, direccion, ciudad, estado,
                zip, telefono, ssn, usuario, password);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterUI.LINK_REGISTER),
                Enter.theValue(nombre).into(RegisterUI.TXT_FIRSTNAME),
                Enter.theValue(apellido).into(RegisterUI.TXT_LASTNAME),
                Enter.theValue(direccion).into(RegisterUI.TXT_ADDRESS),
                Enter.theValue(ciudad).into(RegisterUI.TXT_CITY),
                Enter.theValue(estado).into(RegisterUI.TXT_STATE),
                Enter.theValue(zip).into(RegisterUI.TXT_ZIPCODE),
                Enter.theValue(telefono).into(RegisterUI.TXT_PHONE),
                Enter.theValue(ssn).into(RegisterUI.TXT_SSN),
                Enter.theValue(usuario).into(RegisterUI.LABEL_USERNAME),
                Enter.theValue(password).into(RegisterUI.LABEL_PASSWORD),
                Enter.theValue(password).into(RegisterUI.LABEL_CONFIRM),
                Click.on(RegisterUI.BTN_REGISTER)
        );
    }

}
