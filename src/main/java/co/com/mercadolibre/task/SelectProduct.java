package co.com.mercadolibre.task;


import co.com.mercadolibre.interactions.ClickRandom;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.mercadolibre.userInterface.MLHome.IMB_IMAGE_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(IMB_IMAGE_PRODUCT,isVisible()).forNoMoreThan(20).seconds(),
                ClickRandom.on()


        );


    }

    public static Performable on(){
        return Instrumented.instanceOf(SelectProduct.class).withProperties();
    }

}
