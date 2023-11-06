package Rongdhonu_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Rongdhonu_Utility.Rongdhonu_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Rongdhonu_feature"},
plugin = {"json:target/cucumber.json"},
glue = "Rongdhonu_Stepdefination",tags = {"@Cart"})



public class Rongdhonu_Testrunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void RongStarturl() {
		Rongdhonu_Base Rong = new  Rongdhonu_Base();
		Rong.Rongbrowser();
	}
	@AfterTest
	public void RongCloseurl() {
		Rongdhonu_Base Rong = new  Rongdhonu_Base();
		//Rong.driver.quit();
	}

}
