package co.com.mercadolibre.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MLProduct {

    public static final Target BTN_ADD_CAR = Target.the("Add to car")
            .locatedBy("//span[text()[contains(., 'Agregar al carrito')]]");

}
