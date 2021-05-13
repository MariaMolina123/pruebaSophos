package co.com.prueba.certificacion.stepsdefinitions;

import co.com.prueba.certificacion.enums.Ambiente;
import co.com.prueba.certificacion.questions.ValidacionCompra;
import co.com.prueba.certificacion.tasks.AnadirAlCarrito;
import co.com.prueba.certificacion.tasks.IrAlCarrito;
import co.com.prueba.certificacion.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class compraProductoStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El usuario ingresa a la pagina web{tottus}")
    public void elUsuarioIngresaALaPaginaWebDeTottus(java.lang.String portal) {
        theActorInTheSpotlight().wasAbleTo(Open.url(Ambiente.obtenerUrl(portal)));
    }

    @When("seleccione el producto a comprar")
    public void seleccioneElProductoAComprar() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.conLosDatos(),
                AnadirAlCarrito.deCompras(),
                IrAlCarrito.deCompras()
        );
    }

    @Then("el producto fue agregado exitosamente")
    public void elProductoFueAgregadoExitosamente(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(ValidacionCompra.conNotificacion(mensaje))
        );
    }
}
