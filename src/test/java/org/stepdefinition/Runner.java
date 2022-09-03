package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"org.stepdefinition"}, plugin = "rerun:./src/test/failed.txt" )
public class Runner {

}
