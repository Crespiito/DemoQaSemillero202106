package co.com.qvision.certificacion.demoqa.runners.elements;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/elements/upload_&_download.feature",
        glue = "co.com.qvision.certificacion.demoqa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ""

)
public class UploadDownloadRunner {
}
