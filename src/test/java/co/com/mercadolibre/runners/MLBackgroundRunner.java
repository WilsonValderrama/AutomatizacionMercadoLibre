package co.com.mercadolibre.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/MLBackground.feature",
        glue = "co.com.mercadolibre.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class MLBackgroundRunner {
}
