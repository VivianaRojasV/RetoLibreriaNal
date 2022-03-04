package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CredencialesPageObject extends PageObject {

    private By txtCorreo = By.xpath("//input[@name='usuario']");
    private By txtClave = By.xpath("//input[@name='contrasena']");
    private By btnIniciar = By.xpath("//button[@type='submit']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciar() {
        return btnIniciar;
    }
}
