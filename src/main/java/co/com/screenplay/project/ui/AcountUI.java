package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcountUI extends PageObject {
    public static final Target LINK_NEW_ACOUNT = Target.the("Link registrar nueva cuenta")
            .located(By.xpath("//a[normalize-space()='Open New Account']"));
    public static final Target BTN_NEW_ACOUNT = Target.the("Boton de crear cuenta")
            .located(By.xpath("//input[@value='Open New Account']"));
    public static final Target MESSAGE_OK_ACOUNT = Target.the("Mensaje de confirmación de creacion de cuenta nueva")
            .located(By.xpath("//h1[normalize-space()='Account Opened!']"));
}
