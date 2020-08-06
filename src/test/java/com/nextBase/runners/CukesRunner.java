package com.nextBase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// Runner class
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features", // we have to do right click on Feature class >copy path > copy  Path From Content Root and paste here
        glue = "com/nextBase/step_definitions",// we have to do right click on StepDefinition package >copy path > copy Path From Source Root and paste here
        dryRun=false,
        tags="@login or @message"

//        plugin = {"html:target/cucumber-report.html",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"},

)

public class CukesRunner {
}
