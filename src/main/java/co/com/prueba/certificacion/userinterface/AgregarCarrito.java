package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarCarrito {

    public AgregarCarrito(){

    }
    public static final Target CARRITO = Target.the("Se agrega al producto")
            .located(By.id("catalystSearchBar"));
    public static final Target SELEC_COMPRA = Target.the("se selecciona recoger en tienda")
            .located(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div[2]/button[1]/div"));

    public static final Target SELEC_SEDE = Target.the("se selecciona cual tienda")
            .located(By.xpath("/html/body/div[10]/div/div/div/div[2]/div[2]/div[3]/button[1]"));
    public static final Target CONFIRM = Target.the("se selecciona cual tienda")
            .located(By.xpath("//*[@class='jsx-3085342145 Button Confirmar primary']"));
    public static final Target BUTON_CARRITO = Target.the("se selecciona cual tienda")
            .located(By.xpath("//*[@class='jsx-3085342145 Button Confirmar primary']"));
}
