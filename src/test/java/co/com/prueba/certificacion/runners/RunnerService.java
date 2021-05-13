package co.com.prueba.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/co/com/prueba/certificacion/features/servicioRest.feature",
            snippets = SnippetType.CAMELCASE,
            glue = "co/com/prueba/certificacion/stepdefinitions", tags = "@tags")
    public class RunnerService {
}
