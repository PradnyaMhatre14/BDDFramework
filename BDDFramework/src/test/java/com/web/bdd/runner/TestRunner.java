package com.web.bdd.runner;



import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
monochrome=true,
dryRun=false,
glue="com.web.bdd.stepDefination",
plugin= {"html:target/cucumber-reports",
		"json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber-result.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:"}
)
public class TestRunner {

	@BeforeClass
	public static void setReportConfiguration()
	{
		ExtentProperties property=ExtentProperties.INSTANCE;
		property.setReportPath("./Report/Reports.html");
	}
	
	public static void setConfiguration()
	{
		Reporter.loadXMLConfig("./Config/extent-config.xml");
	}

}
