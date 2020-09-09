package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\java programs\\BDDdemo\\src\\main\\java\\Feature\\Homepage.feature",   //******* path of the feature file*******//
                 glue="stepDefination",                                             //*******path of the stepDefination file********//
                 plugin= {"pretty","html:test-output"},
                 strict=false,  //to check if any step is not defined in the step defination file
                 dryRun=false,  //to checkc the mapping is proper between the feature file and step defination file.if any steps are missed .
                 monochrome=true // Display the output in readable formate under console.
                 // tags= {"@RegressionTest,@SmokeTest"}
                 //tags= {"@SmokeTest","~@RegressionTest","~@SanityTest"}
                 )
public class testRunner {
    //{"@RegressionTest,@SmokeTest"}
	//OR: Operator OR represcents (,). i.e it execute all tests tagged as  regression test tag or  smoketest tag cases
	//AND :Operator AND Represcents ({"@RegressionTest", "@SmokeTest"}) . i.e it execute all tests taged as regression test and smoke test cases only.	
    //how to skip the test using till (~) tag {"~@SmokeTest","~@RegressionTest","~@SanityTest"}.
	
}





