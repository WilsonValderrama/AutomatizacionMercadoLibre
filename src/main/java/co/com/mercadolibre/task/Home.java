package co.com.mercadolibre.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.mercadolibre.userInterface.MLHome.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Home implements Task {


    @Override
    public <T extends Actor> void performAs(T actor){


        actor.attemptsTo(
                WaitUntil.the(IMB_IMAGE_PRODUCT,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(IMB_IMAGE_PRODUCT)

        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(Home.class).withProperties();
    }



}
