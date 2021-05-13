package co.com.prueba.certificacion.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.xpath.operations.String;

import java.util.Map;

import static co.com.prueba.certificacion.util.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class automatiServicio {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("El candidato crea un usuario en el metodo {string}")
    public void elCandidatoCreaUnUsuarioEnElMetodo() {
        theActorCalled("candidato").whoCan(CallAnApi.at(BASE_URL.toString));


    }

    @When("El candidato entrega la informacion para el metodo  {string}")
    public void provideInformationThePostMethod(String post, Map<String, String> dataTable) {
        theActorInTheSpotlight().attemptsTo(PostMethod.createUser(post, PostMethod.bodyUser(dataTable)));
    }

    @Then("el candidato valida la creacion del usuario en el metodo")
    public void verifyTheCreationOfThisUserWithTheGetMethod() {
        theActorInTheSpotlight()
                .should(seeThatResponse(response -> response.body("result.first_name", equalTo("Candidate")))
                        .orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
    }
}
