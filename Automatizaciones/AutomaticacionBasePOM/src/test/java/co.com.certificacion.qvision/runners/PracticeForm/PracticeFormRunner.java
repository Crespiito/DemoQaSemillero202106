package co.com.certificacion.qvision.runners.PracticeForm;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/practiceform.feature",
        glue = "co.com.certificacion.qvision.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PracticeFormRunner {
}
