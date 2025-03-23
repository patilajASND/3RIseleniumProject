package com.background;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\Cucumberbasics\\src\\test\\resources\\Features\\loginwithcredintials.feature"
               ,glue="com.background")
public class Testrunner {

}
