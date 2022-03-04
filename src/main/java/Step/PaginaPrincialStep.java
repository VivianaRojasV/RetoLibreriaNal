package Step;

import PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPrincialStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void abrirNavegador (){
        paginaPrincipalPageObject.open();
    }

    @Step
    public void clickMiCuenta (){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void clickIniciarSesion (){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnIniciarSesion()).click();
    }
}
