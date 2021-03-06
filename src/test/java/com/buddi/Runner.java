package com.buddi;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/resources/features/homepage.feature",
        plugin = {"pretty","html:target/cucumber-report"},
        glue = {"classpath:com.buddi"},
        dryRun = false

)

public class Runner {
}
