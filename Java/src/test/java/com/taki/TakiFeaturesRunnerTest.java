package com.taki;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/java/com/taki/takiFeatures",
    glue = "com.taki.takiStepDefinitions",
    tags = "not @ignore"
    )
public class TakiFeaturesRunnerTest {

}
