package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

    public class CerrarSesionPageObject extends PageObject {
        private By btnCerrarSesion = By.xpath ("(//a[@class='d-flex justify-content-between align-items-center text--blue text--xl text--normal text--lh-normal'])[7]");

        public By getBtnCerrarSesion() {
            return btnCerrarSesion;
        }
    }

