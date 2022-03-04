package com.librerianacional.www.StepsDefinitions;

import Step.CredencialesStep;
import Step.SesionStep;
import Step.ValidacionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import Step.PaginaPrincialStep;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class IniciarSesionStepsDefinitions {
    @Steps
    ValidacionStep validacionStep;
    @Steps
    CredencialesStep credencialesStep;
    @Steps
    SesionStep sesionStep;
    @Steps
    PaginaPrincialStep paginaPrincialStep;

    @Dado("^que el usuario se encuentra en la pagina principal$")
    public void queElUsuarioSeEncuentraEnLaPaginaPrincipal() {
        paginaPrincialStep.abrirNavegador();
    }

    @Cuando("^da en el boton de inicio sesion$")
    public void daEnElBotonDeInicioSesion() {
        paginaPrincialStep.clickMiCuenta();
        paginaPrincialStep.clickIniciarSesion();
        sesionStep.clickCorreoYContrasena();
    }

    @Cuando("^escribe las credenciales$")
    public void escribeLasCredenciales() throws IOException {
    credencialesStep.clickCorreoElectronico();
    credencialesStep.clickContrasena();
    credencialesStep.clickIniciarSesion();
    }

    @Entonces("^inicia sesion correctamente$")
    public void iniciaSesionCorrectamente() {
        validacionStep.validarSesion();
    }
}
