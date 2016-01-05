package framework;

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

public class sample 
{
@Test
public void ravitest() throws IOException
{
	ExtentReports reports=new ExtentReports("D:\\Ravi\\selenium\\src\\com\\selenium\\reports\\rrrr.html", true);
	ExtentTest test=reports.startTest("this is for beginingg");
	
	
FirefoxDriver ravi=new FirefoxDriver();
test.log(LogStatus.INFO, "firefoxx opnnnn time");
ravi.get("http://google.com");
test.log(LogStatus.INFO, "time of google");
ravi.findElement(By.linkText("Gmail")).click();
test.log(LogStatus.INFO, "gmail time");
ravi.findElement(By.id("Email")).sendKeys("rahul.lucky25@gmail.com");
test.log(LogStatus.INFO, "time of mail");
ravi.findElement(By.id("next")).click();
test.log(LogStatus.INFO, "time of clicked time");
File srcFile=((TakesScreenshot)ravi).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile, new  File("D:\\Ravi\\selenium\\src\\com\\selenium\\srcnshots\\rahul.png"));

test.addScreenCapture("D:\\Ravi\\selenium\\src\\com\\selenium\\srcnshots\\rahul.png");
reports.endTest(test);
reports.flush();
}
}