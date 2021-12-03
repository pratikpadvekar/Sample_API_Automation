/**
 * 
 */
package Reports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


/**
 * @author pratikpadwekar
 *
 */
public class ExtendReports {
	
	@Test
	private void ExtendReport() throws IOException {
		// TODO Auto-generated method stub
			// start reporter 
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn_automation2.html");
			
			
			//create ExtentReports and attach reporter(s)
			
			ExtentReports extent = new ExtentReports(); 
			extent.attachReporter(reporter);
			
			
			//Test Case 1 
			ExtentTest logger = extent.createTest("Test Extend Report");
			logger.log(Status.INFO, "Login to Amazon");
			logger.log(Status.PASS, "The Title is verified");
			logger.pass("Test Case is Pass with due to this : ",MediaEntityBuilder.createScreenCaptureFromPath("/Users/pratikpadwekar/eclipse-workspace/com.org.APISample/ScreenShots/png22.png").build());
			extent.flush();
			
			//Test case 2 
			ExtentTest logger2 = extent.createTest("Test Extend Report");
			logger2.log(Status.INFO,"Log off from Amazon");
			logger2.log(Status.FAIL, "The Test case is fail");
			logger2.fail("Failed due to this : ",MediaEntityBuilder.createScreenCaptureFromPath("/Users/pratikpadwekar/eclipse-workspace/com.org.APISample/ScreenShots/png22.png").build());
			extent.flush();
			
			System.out.println("Extend report Successfully");

	}

}
