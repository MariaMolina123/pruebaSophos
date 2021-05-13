package co.com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.prueba.certificacion.userinterface.AgregarCarrito.BUTON_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAlCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTON_CARRITO));
    }

    public static IrAlCarrito deCompras(){
        return instrumented(IrAlCarrito.class);
    }


}
