package com.librerianacional.www.StepsDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import Step.CerrarSesionStep;
import net.thucydides.core.annotations.Steps;

public class CerrarSesionStepsDefinitions {
    @Steps
    CerrarSesionStep cerrarSesionStep;

    @Cuando("^selecciono el boton cerrar sesion$")
    public void seleccionoElBotonCerrarSesion() throws InterruptedException {
        cerrarSesionStep.cerrarSesion();
    }

    @Entonces("^cierro sesion exitosamente$")
    public void cierroSesionExitosamente() {
        cerrarSesionStep.cerrarPagina();
    }
}

