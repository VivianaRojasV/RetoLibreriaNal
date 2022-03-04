package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SesionPageObject extends PageObject {

    private By btnDatos = By.xpath("//a[@href='/usuario/iniciar-sesion']/div");

    public By getBtnDatos() {
        return btnDatos;
    }
}
