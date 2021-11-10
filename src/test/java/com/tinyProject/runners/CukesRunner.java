package com.tinyProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                  "json:target/cucumber.json",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/tinyProject/step_definitions",
        dryRun = false,
        tags = "@wip"

)

public class CukesRunner {
}

