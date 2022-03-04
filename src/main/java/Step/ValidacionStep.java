package Step;

import PageObjects.ValidacionInicioSesionPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import static org.junit.Assert.assertThat;

public class ValidacionStep {
    ValidacionInicioSesionPageObject validacionInicioSesionPageObject = new ValidacionInicioSesionPageObject();

    @Step
    public void validarSesion (){
        assertThat(validacionInicioSesionPageObject.getDriver().findElement(validacionInicioSesionPageObject.
                getTxtValidacion()).isDisplayed(),Matchers.is(true));
    }
}
