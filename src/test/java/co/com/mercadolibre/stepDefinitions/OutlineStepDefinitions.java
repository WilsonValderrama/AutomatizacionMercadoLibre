package co.com.mercadolibre.stepDefinitions;


import co.com.mercadolibre.globalVar.Global;
import co.com.mercadolibre.task.HomeOutline;
import co.com.mercadolibre.task.SelectProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Assert;


public class OutlineStepDefinitions {

    @When("^Reload the page and validate the logo on the page\\.$")
    public void reloadThePageAndValidateTheLogoOnThePage() {

        OnStage.theActorInTheSpotlight().attemptsTo(HomeOutline.on());

    }


    @When("^I choose a product I save its name$")
    public void iChooseAProductISaveItsName() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.on());
    }

    @Then("^Valid if the product is the same$")
    public void validIfTheProductIsTheSame() {

        Assert.assertEquals(Global.Check,Global.CcheckTittle);

    }

}
