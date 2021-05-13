package co.com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.certificacion.userinterface.SeleccionProducto.PRODUCTO;
import static co.com.prueba.certificacion.userinterface.SeleccionProducto.TEXT_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TEXT_BUSQUEDA),
                (Performable) Enter.theValue("TV LED 49 UHD 4K SMART NETFLIX YOUTUBE"),
                Click.on(PRODUCTO));

    }

    public static SeleccionarProducto conLosDatos(){
        return instrumented(SeleccionarProducto.class);
    }


}
