package co.com.qvision.certificacion.demoqa.runners.services;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/services/bookStoreService.feature",
                    glue = {"co.com.qvision.certificacion.demoqa.stepdefinitions.services",
                            "co.com.qvision.certificacion.demoqa.stepdefinitions.hookService"},
                snippets = CucumberOptions.SnippetType.CAMELCASE
                )
public class BookStoreServicesRunner {
}
