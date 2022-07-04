package com.bluecrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html: target/cucumber-reports.html",
                "rerun:target/rerun.txt",             //we can change the name with anything for  rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/bluecrm/step_definitions",
        dryRun= false,//it means I turned it off and it will execute my codes
        tags = "@wip"
        //tags ="@Regression"
        //publish = false
)
public class CukesRunner {

}
