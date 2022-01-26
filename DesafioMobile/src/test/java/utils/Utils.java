package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.core.api.Scenario;

public class Utils {
	
	public static AppiumDriver<WebElement> driver;

	public static void acessarColorNote() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
		desiredCapabilities.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");


		driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	}
	
	public static void acionarAllow() {
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	    el1.click();
	    try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ie) {	
	    }
	  }
	    
	  public static void acionarSkip() {
		MobileElement el2 = (MobileElement) driver.findElementById("com.socialnmobile.dictapps.notepad.color.note:id/btn_start_skip");
		el2.click();  
	  }
	  
	  public static void capturarScreenshot(Scenario scenario) {
		  final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		  scenario.embed(screenshot, "image/png");
		  
	  }
	
	
}

