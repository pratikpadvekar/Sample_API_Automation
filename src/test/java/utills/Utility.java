///**
// * 
// */
//package utills;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//
//
//// This Utills is use for only Chrome Driver hence for API Automation we are not use.
///**
// * @author pratikpadwekar
// *
// */
//public class Utility {
//
//	
//	public static String getScreenShot(webDriver driver)
//	{
//		
//		TakeScreenShot ts = (TakeScreenShot) driver;
//		File src =ts.getScreenShotAs(OutputType.FILE);
//		
//		String path =System.getProperty("user.dir")+"/ScreenShorts/"+System.currentTimeMillis()+".png";
//		File destination = new File(path);
//		
//		try 
//		{
//			FileUtils.copyFile(src, destination);
//		}
//		catch(IOException e )
//		{
//			
//		System.out.println("Capture Failed" +e.getMessage());
//		}
//		
//		return path;
//	}
//	
//}
