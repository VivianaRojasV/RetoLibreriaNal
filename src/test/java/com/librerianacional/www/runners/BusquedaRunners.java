package com.librerianacional.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/BuscarTema.feature",
        glue = "com.librerianacional.www.StepsDefinitions",
        snippets = SnippetType.CAMELCASE)

public class BusquedaRunners {
}
