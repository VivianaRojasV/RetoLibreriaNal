package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarTemaPageObject extends PageObject {

    private By txtBusqueda =  By.xpath("//header//input[contains(@placeholder,'Buscar')]");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }
}
