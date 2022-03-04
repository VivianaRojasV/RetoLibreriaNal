package Step;

import PageObjects.CredencialesPageObject;
import Utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import java.io.IOException;

public class CredencialesStep {
    CredencialesPageObject credencialesPageObject = new CredencialesPageObject();
    DatosExcel datosExcel =new DatosExcel();

    @Step
    public void clickCorreoElectronico () throws IOException {
        credencialesPageObject.getDriver().findElement(credencialesPageObject.getTxtCorreo()).
                sendKeys(datosExcel.leerDatoExcel("credenciales","excel.xlsx",1,0));
    }

    @Step
    public void clickContrasena () throws IOException{
        credencialesPageObject.getDriver().findElement(credencialesPageObject.getTxtClave()).
                sendKeys(datosExcel.leerDatoExcel("credenciales","excel.xlsx",1,1));
    }

    @Step
    public void clickIniciarSesion (){
        credencialesPageObject.getDriver().findElement(credencialesPageObject.getBtnIniciar()).click();
    }
}
