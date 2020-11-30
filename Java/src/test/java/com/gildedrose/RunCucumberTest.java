package com.gildedrose;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/features",
    glue = "com.stepDefinitions"
    )
public class RunCucumberTest {

}
