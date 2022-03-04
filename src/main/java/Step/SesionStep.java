package Step;

import PageObjects.SesionPageObject;
import net.thucydides.core.annotations.Step;

public class SesionStep {
    SesionPageObject sesionPageObject = new SesionPageObject();

    @Step

    public void clickCorreoYContrasena (){
        sesionPageObject.getDriver().findElement(sesionPageObject.getBtnDatos()).click();
    }
}
