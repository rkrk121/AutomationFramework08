package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners
public class ListenerUtility  extends BaseClass implements ITestListener{
	
	@Override // It is present in ITtestlisteners
	public void onTestFailure(ITestResult result) {
		String methodName =result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+methodName+".png");
		
		try {
			FileHandler.copy(temp, dest);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName =result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+methodName+".png");
		try {
			FileHandler.copy(temp, dest);
		}catch(IOException e) {
			e.printStackTrace();
								}
																	}
}
