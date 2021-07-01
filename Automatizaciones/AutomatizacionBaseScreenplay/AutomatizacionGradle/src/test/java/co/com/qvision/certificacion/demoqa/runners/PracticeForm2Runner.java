package co.com.qvision.certificacion.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/forms/practice_form2.feature",
glue = "co.com.qvision.certificacion.demoqa.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE,
tags = "@test11")
public class PracticeForm2Runner {


}