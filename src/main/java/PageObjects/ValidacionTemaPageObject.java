package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionTemaPageObject extends PageObject {
    private By txtValidacionLibro = By.xpath("//a[text()=' ALGEBRA BALDOR 4 EDICION ']");

    public By getTxtValidacionLibro() {
        return txtValidacionLibro;
    }
}
