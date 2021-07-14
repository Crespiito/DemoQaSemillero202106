package co.com.certificacion.qvision.runners.forms;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/forms/practiceForm.feature",
       // glue = "co.com.certificacion.qvision.stepdefinitions",
        glue ={"co.com.certificacion.qvision.stepdefinitions.services","co.com.certificacion.qvision.stepdefinitions.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)


public class PracticeFormRunner {
}
