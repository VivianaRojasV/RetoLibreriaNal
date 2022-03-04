package Step;

import PageObjects.CerrarSesionPageObject;
import Utils.Scroll;
import net.thucydides.core.annotations.Step;


public class CerrarSesionStep {
    CerrarSesionPageObject cerrarSesionPageObject = new CerrarSesionPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void cerrarSesion () throws InterruptedException {
        Thread.sleep(10000);
        cerrarSesionPageObject.getDriver().findElement(cerrarSesionPageObject.getBtnCerrarSesion()).click();
    }
    @Step
    public void cerrarPagina(){
        cerrarSesionPageObject.getDriver().quit();
    }
}
