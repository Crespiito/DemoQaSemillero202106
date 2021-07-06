package co.com.qvision.certificacion.demoqa.runners.windows;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/windows/nested_frames.feature",
                glue = "co.com.qvision.certificacion.demoqa.stepdefinitions"
)
public class NestFramesRunner {
}