package co.com.mercadolibre.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.com.mercadolibre.userInterface.MLHome.IMG_PRODUCT_TEXT;

public class ClickRandom implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> ListProducts = IMG_PRODUCT_TEXT.resolveAllFor(actor);
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        ListProducts.get(randomNumber).click();

    }

    public static Performable on(){
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }

}
