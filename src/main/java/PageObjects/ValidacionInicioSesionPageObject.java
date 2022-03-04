package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionInicioSesionPageObject extends PageObject {
    private By txtValidacion = By.xpath("//div[text()='Bienvenido a tu cuenta']");

    public By getTxtValidacion() {
        return txtValidacion;
    }
}
