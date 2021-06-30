package co.com.qvision.certificacion.demoqa.runners.forms;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/elements/text_box.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.elements","co.com.qvision.certificacion.demoqa.stepdefinitions.Hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class MenuRunner {
}
