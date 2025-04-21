package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferUI extends PageObject {
    public static final Target URL_TRANSFER = Target.the("Url para transferencia")
            .located(By.xpath("//a[normalize-space()='Transfer Funds']"));
    public static final Target TXT_AMOUNT = Target.the("Formulario monto")
            .located(By.xpath("//input[@id='amount']"));
    public static final Target BTN_FROM_ACCOUNT= Target.the("Formulario cuenta desde")
            .located(By.cssSelector("#fromAccountId"));
    public static final Target BTN_TO_ACCOUNT = Target.the("Formulario cuenta hacia")
            .located(By.xpath("(//select[@id='toAccountId'])[1]"));
    public static final Target BTN_TRANSFER = Target.the("Boton de transferir")
            .located(By.xpath("//input[@value='Transfer']"));
    public static final Target MESSAGE_OK = Target.the("Mensaje de confirmacion")
            .located(By.cssSelector("div[id='showResult'] h1[class='title']"));
}
