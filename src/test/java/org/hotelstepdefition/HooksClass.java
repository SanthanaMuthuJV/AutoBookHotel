package org.hotelstepdefition;

import org.hotelbookingbase.BaseClassCucu;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class HooksClass extends BaseClassCucu {
 
	@Before(order=10)
	public void preCondition1() {
		maxWin();
	}
	
	
	@Before(order = 1)
	public void preCondition2() {
		browserLanch();

	}
	
	@After(order=22)
	public void postCondition1() {
//		closeBrowser();
   System.out.println("complete");
	}
	@After(order=111)
	public void postCondition2(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] ssAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(ssAs, "image/png");
			
			System.out.println("screenshot taked");	
		}
		
		
		

	}
	
}
