package co.com.qvision.certificacion.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/services/book_store_services.feature",
glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.hooksservice",
        "co.com.qvision.certificacion.demoqa.stepdefinitions.services",
        "co.com.qvision.certificacion.demoqa.stepdefinitions.DataType"},
snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BookStoreServicesRunner{
}
