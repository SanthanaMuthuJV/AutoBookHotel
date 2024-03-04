package org.hoteltestrunner;

import org.hotelstepdefition.JVMRepo;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\MavenHotel\\src\\test\\resources\\hotel.feature",
				glue="org\\hotelstepdefition",
				monochrome=true,
				snippets=SnippetType.CAMELCASE,
				
				plugin={"pretty","html:HtmlReport",
               		 "junit:JunitReports\\face.xml",           
               		 "json:Json\\fb.json",
             		// "rerun:C:\\Users\\USER\\eclipse-workspace\\MavenCu\\src\\test\\resources\\failed.txt"
               		  }
				
				)
public class TestRunnerHotel {
@AfterClass
public static void postReport() {
		JVMRepo.repo("Json\\fb.json");
	System.out.println("jvm report created");
	//
	//}
	
	
	
}

}
