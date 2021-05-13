package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionProducto {

    public SeleccionProducto(){

    }
    public static final Target TEXT_BUSQUEDA = Target.the("Espacio para consultar producto")
            .located(By.id("catalystSearchBar"));
    public static final Target PRODUCTO = Target.the("Se da click en el producto")
            .located(By.xpath("//*[@id='container']/div[1]/section/div[2]/div[4]/ul/li[1]/section/div/a/div[1]"));

}
