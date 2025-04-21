package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.*;
import co.com.screenplay.project.ui.AcountUI;
import co.com.screenplay.project.ui.HomeUI;
import co.com.screenplay.project.ui.RegisterUI;
import co.com.screenplay.project.ui.TransferUI;
import io.cucumber.java.en.*;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.screenplay.project.util.Constant.TIME_SHORT;
import static co.com.screenplay.project.util.Time.waiting;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class OpenWebStep {

    @When("el usuario se registra con los datos")
    public void elUsuarioSeRegistraConLosDatos() {
        // Crear usuario único
        String username = "stefania3";
        String password = "clave123";

        // Guardar en sesión
        Map<String, String> datos = new HashMap<>();
        datos.put("username", username);
        datos.put("password", password);
        Serenity.setSessionVariable("usuarioRegistrado").to(datos);

        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.conDatos(
                        "Andrea", "Lopez", "Av. Quito 123", "Quito", "Pichincha", "170103",
                        "0999999999", "123456789", username, password
                )
        );

        waiting(TIME_SHORT);
    }

    @Then("deberia ver un mensaje de bienvenida")
    public void deberiaVerUnMensajeDeBienvenida() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(RegisterUI.MESSAGE_REGISTER),
                        isVisible())
        );

        // Logout para iniciar sesión nuevamente
        OnStage.theActorInTheSpotlight().attemptsTo(Logout.ahora());
        waiting(TIME_SHORT);
    }

    @And("el cliente inicia sesion con credenciales validas")
    public void elClienteIniciaSesionConCredencialesValidas() {
        Map<String, String> datos = Serenity.sessionVariableCalled("usuarioRegistrado");

        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.conCredenciales(datos.get("username"), datos.get("password"))
        );

        waiting(TIME_SHORT);
    }

    @Then("deberia ver su dashboard personal")
    public void deberiaVerSuDashboardPersonal() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(HomeUI.TEXT_WELCOME), isVisible())
        );
        waiting(TIME_SHORT);
    }
    @When("el cliente abre una nueva cuenta")
    public void elClienteAbreUnaNuevaCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NewAcount.nueva()
        );
        waiting(TIME_SHORT);
    }
    @Then("deberia ver la cuenta creada exitosamente")
    public void deberiaVerLaCuentaCreadaExitosamente() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(AcountUI.MESSAGE_OK_ACOUNT), isVisible())
        );
    }

    @When("transfiere {int} dolares entre dos cuentas")
    public void transfiereDolaresEntreDosCuentas(int monto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Transferencia.deMonto(String.valueOf(monto))
        );
        waiting(TIME_SHORT);
    }

    @Then("deberia ver confirmacion de transferencia exitosa")
    public void deberiaVerConfirmacionDeTransferenciaExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(TransferUI.MESSAGE_OK),
                        isVisible())
        );
    }
}
