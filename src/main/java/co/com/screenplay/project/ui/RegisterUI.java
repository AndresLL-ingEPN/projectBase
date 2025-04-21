package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUI extends PageObject {
    public static final Target LINK_REGISTER = Target.the("Link registrar usuario")
            .located(By.xpath("//a[normalize-space()='Register']"));
    ///a[contains(text(),'Register')]

    public static final Target TXT_FIRSTNAME = Target.the("Formulario nombre")
            .located(By.id("customer.firstName"));
    public static final Target TXT_LASTNAME = Target.the("Formulario apellido")
            .located(By.id("customer.lastName"));
    public static final Target TXT_ADDRESS = Target.the("Formulario dirrecion")
            .located(By.id("customer.address.street"));
    public static final Target TXT_CITY = Target.the("Formulario ciudad")
            .located(By.id("customer.address.city"));
    public static final Target TXT_STATE = Target.the("Formulario estado")
            .located(By.id("customer.address.state"));
    public static final Target TXT_ZIPCODE = Target.the("Formulario codigo zip")
            .located(By.id("customer.address.zipCode"));
    public static final Target TXT_PHONE = Target.the("Formulario numero")
            .located(By.id("customer.phoneNumber"));
    public static final Target TXT_SSN = Target.the("Formulario ssn")
            .located(By.id("customer.ssn"));
    public static final Target LABEL_USERNAME = Target.the("Laber usuario")
            .located(By.id("customer.username"));
    public static final Target LABEL_PASSWORD = Target.the("Label contrasena")
            .located(By.id("customer.password"));
    public static final Target LABEL_CONFIRM = Target.the("Laberl confirmacion contraseña")
            .located(By.id("repeatedPassword"));
    public static final Target BTN_REGISTER = Target.the("Boton registrar formulario")
            .located(By.xpath("//input[@value='Register']"));
    public static final Target MESSAGE_REGISTER = Target.the("Mensaje de confirmación de registro")
            .located(By.xpath("//p[@class='smallText']"));

    public static final Target BTN_LOGOUT = Target.the("Boton de cerrar sesion")
            .located(By.xpath("//a[normalize-space()='Log Out']"));
}
