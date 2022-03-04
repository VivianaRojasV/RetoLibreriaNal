package PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://librerianacional.com/")
public class PaginaPrincipalPageObject extends PageObject {

    private By btnMiCuenta = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    private By btnIniciarSesion = By.xpath("(//a[text()=' Iniciar Sesión '])[2]");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
