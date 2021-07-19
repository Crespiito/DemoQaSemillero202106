package co.com.certificacion.qvision.runners.servicios;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/servicios/book_store_services.feature",
        glue = "co.com.certificacion.qvision.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class BookStoreServicesRunner {
}