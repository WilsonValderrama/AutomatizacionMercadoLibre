package co.com.mercadolibre.task;


import co.com.mercadolibre.interactions.Refresh;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.mercadolibre.userInterface.MLHome.IMG_LOGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeOutline implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(IMG_LOGO,isVisible()).forNoMoreThan(10).seconds(),
                Refresh.on()

        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(HomeOutline.class).withProperties();
    }

}
