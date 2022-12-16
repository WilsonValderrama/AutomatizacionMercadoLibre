package co.com.mercadolibre.task;

import co.com.mercadolibre.interactions.BackHome;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.mercadolibre.userInterface.MLProduct.BTN_ADD_CAR;

public class Product implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Check.whether(WebElementQuestion.stateOf(BTN_ADD_CAR), WebElementStateMatchers
                        .isVisible()).andIfSo(
                        BackHome.on()
                ).otherwise()

        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(Product.class).withProperties();
    }

}
