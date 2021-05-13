package co.com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.prueba.certificacion.userinterface.AgregarCarrito.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AnadirAlCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CARRITO),
                Click.on(SELEC_COMPRA),
                Click.on(SELEC_SEDE),
                Click.on(CONFIRM)
        );

    }

    public static AnadirAlCarrito deCompras(){
        return instrumented(AnadirAlCarrito.class);
    }


}




