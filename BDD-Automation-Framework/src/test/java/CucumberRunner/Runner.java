package CucumberRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	//method name: Runner
	// purpose: This is TestNG Runner file which is responsible to run the entire suite
	// created: Mar 08, 2019
	// Author: Sourabh Mondal

@CucumberOptions(
				plugin={"pretty","html:target/html/","json:target/cucumber.json"},
				glue={"com.Core","Common"},
				features="./src/test/resources/features/",
				dryRun= false
		)
public class Runner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void startUpTest(){
		System.out.println("Test Execution begins...");
	}
	@AfterSuite
	public void tearDownTest(){
		System.out.println("== Test End ==");
	}
}
