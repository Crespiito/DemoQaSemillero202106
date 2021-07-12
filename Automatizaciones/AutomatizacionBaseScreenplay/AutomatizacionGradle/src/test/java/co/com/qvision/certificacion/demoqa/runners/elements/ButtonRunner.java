package co.com.qvision.certificacion.demoqa.runners.elements;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/elements/buttons.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.elements","co.com.qvision.certificacion.demoqa.stepdefinitions.Hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Test5"


)
public class ButtonRunner {
}
