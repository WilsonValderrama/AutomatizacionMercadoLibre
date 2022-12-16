package co.com.mercadolibre.stepDefinitions;

import co.com.mercadolibre.driver.SeleniumWebDriver;
import co.com.mercadolibre.interactions.SelectLogo;
import co.com.mercadolibre.task.Home;
import co.com.mercadolibre.task.Product;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class MLBackgroundStepDefinitions {

    @Before
    public void before() throws IOException {

        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^I am on the website of (.*)$")
    public void iAmOnTheWebsiteOfHttpsWwwMercadolibreComCo(String Url) {
        OnStage.theActorCalled("Wilson")
                .can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }

    @When("^I choose a product$")
    public void iChooseAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(Home.on());
    }

    @Then("^Validate the interface add cart and return to home page$")
    public void validateTheInterfaceAddCartAndReturnToHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Product.on());
        OnStage.theActorInTheSpotlight().attemptsTo(SelectLogo.on());
    }








}
