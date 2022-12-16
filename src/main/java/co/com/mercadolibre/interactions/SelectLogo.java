package co.com.mercadolibre.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.mercadolibre.userInterface.MLHome.IMG_LOGO;


public class SelectLogo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Check.whether(WebElementQuestion.stateOf(IMG_LOGO), WebElementStateMatchers
                        .isVisible()).andIfSo(

                ).otherwise()

        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(SelectLogo.class).withProperties();
    }

}
