package co.com.qvision.certificacion.demoqa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/forms/practice_form.feature",
        glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.homepage","co.com.qvision.certificacion.demoqa.stepdefinitions.hooks","co.com.qvision.certificacion.demoqa.stepdefinitions.practiceform"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class PracticeFormRunner {
}
