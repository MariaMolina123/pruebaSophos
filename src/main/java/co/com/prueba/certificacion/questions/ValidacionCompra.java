package co.com.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import java.lang.annotation.Target;

public class ValidacionCompra implements Question<String> {
    private Target mensaje;

    public ValidacionCompra(Target mensaje) {
        this.mensaje = mensaje;
    }


    @Override
    @Subject("Se verifica compra en carrito")
    public String answeredBy(Actor actor) {
        return Text.of((net.serenitybdd.screenplay.targets.Target) mensaje).viewedBy(actor).asString().trim();
    }
    public static ValidacionCompra conNotificacion(String mensaje) {
        return new ValidacionCompra(mensaje);
    }
}
