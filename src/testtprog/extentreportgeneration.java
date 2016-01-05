package testtprog;

import java.io.File;



import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class extentreportgeneration {
@Test
public void reporttest() throws IOException
{
	ExtentReports reports=new ExtentReports("D:\\Ravi\\test-output\\Suite\\Test of testng.html", true);
	ExtentTest test=reports.startTest("google and gmail test");
	FirefoxDriver driver=new FirefoxDriver();
	test.log(LogStatus.INFO,"launch firefox" );
	driver.get("http://google.com");
	test.log(LogStatus.INFO,"open google" );
	driver.findElement(By.linkText("Gmail")).click();
	test.log(LogStatus.INFO,"clicked on gmail" );
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("D:\\Ravi\\selenium\\src\\com\\qedge\\screenshots\\screen.png"));
	test.addScreenCapture("D:\\Ravi\\selenium\\src\\com\\qedge\\screenshots\\screen.png");
	reports.endTest(test);
	reports.flush();

}
}
 