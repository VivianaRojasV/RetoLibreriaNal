package com.librerianacional.www.StepsDefinitions;

import Step.BuscarTemaStep;
import Step.ValidacionTemaStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class BusquedaStepsDefinitions {

    @Steps
    BuscarTemaStep buscarTemaStep;
    @Steps
    ValidacionTemaStep validacionTemaStep;

    @Cuando("^digito el nombre del libro$")
    public void digitoElNombreDelLibro() throws IOException, InterruptedException {
        buscarTemaStep.digitarNombreLibro();
        buscarTemaStep.enter();
    }

    @Entonces("^encuentra el libro exitosamente$")
    public void encuentraElLibroExitosamente() {
        validacionTemaStep.validarLibro();
    }
}
