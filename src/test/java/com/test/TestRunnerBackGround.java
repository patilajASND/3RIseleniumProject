package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\Cucumberbasics\\src\\test\\resources\\Features\\BackgroundPractice.feature"
                     ,glue= {"com.test"})
public class TestRunnerBackGround {


}
