package Step;

import PageObjects.BuscarTemaPageObject;
import Utils.DatosExcel;
import Utils.Esperas;
import Utils.ExcepcionMensaje;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.io.IOException;



public class BuscarTemaStep {

    BuscarTemaPageObject buscarTemaPageObject = new BuscarTemaPageObject();
    DatosExcel datosExcel =new DatosExcel();
    Esperas esperas = new Esperas();

    @Step
    public void digitarNombreLibro() throws IOException {
        try {
            esperas.esperaExplicitaClick(buscarTemaPageObject.getTxtBusqueda(), buscarTemaPageObject.getDriver());
            buscarTemaPageObject.getDriver().findElement(buscarTemaPageObject.getTxtBusqueda()).
                    sendKeys(datosExcel.leerDatoExcel("busqueda", "excel.xlsx", 1, 0));
        }catch (Exception e){
            throw new ExcepcionMensaje("El elemento no existe");
        }
    }
    @Step
    public void darEnter(By elemento){
        buscarTemaPageObject.getDriver().findElement(elemento).sendKeys(Keys.ENTER);
    }
    @Step
    public void enter (){
        darEnter(buscarTemaPageObject.getTxtBusqueda());
    }
    @Step
    public void darclick () throws InterruptedException {
        esperas.esperaImplicita(10);
        buscarTemaPageObject.getDriver().findElement(buscarTemaPageObject.getTxtBusqueda()).click();
    }

}
