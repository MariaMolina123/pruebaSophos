package co.com.prueba.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co/com/prueba/certificacion/features/compraProducto.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co/com/prueba/certificacion/stepdefinitions/compraProductoStepDefinitions", tags = "@Scenario1")

public class RunnerProyecto {

}