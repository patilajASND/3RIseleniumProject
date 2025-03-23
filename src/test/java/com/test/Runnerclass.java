package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.test"},plugin= {"pretty","json:target/JsonReports/report.json",
		"json:target/JsonReports/report.json"
		,"junit:target/XMLReports/report.xml"},
		tags="@smoketest")
public class Runnerclass {

}
