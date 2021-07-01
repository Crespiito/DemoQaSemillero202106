package co.com.qvision.certificacion.demoqa.runners.elements;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/elements/radio_button.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions", "co.com.qvision.certificacion.demoqa.stepdefinitions.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RadioButtonRunner {
}
