package co.com.mercadolibre.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.com.mercadolibre.userInterface.MLHome.*;


public class SelectProductInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> ListProducts = IMB_IMAGE_PRODUCT.resolveAllFor(actor);
        Random random = new Random();
        int randomNumber = random.nextInt(4);
       // Global.Check = ListProducts.get(randomNumber).getText();
        //Global.Check = ListProducts.get(2).getText();
        //ListProducts.get(2).click();

    }

    public static Performable on(){
        return Instrumented.instanceOf(SelectProductInteraction.class).withProperties();
    }

}
