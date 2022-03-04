package Step;

import PageObjects.ValidacionTemaPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertThat;

public class ValidacionTemaStep {
    ValidacionTemaPageObject validacionTemaPageObject = new ValidacionTemaPageObject();

    @Step
    public void validarLibro(){
        assertThat(validacionTemaPageObject.getDriver().findElement(validacionTemaPageObject.
                getTxtValidacionLibro()).isDisplayed(), Matchers.is(true));
    }
}
