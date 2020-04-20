package com.kdrtut.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/khadeer/IdeaProjects/seleniumtut/src/test/resources/features"},
        glue={"classpath:com.kdrtut.stepdefs"}, //the path of the step definition files
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)
public class CukeRunner {
}
