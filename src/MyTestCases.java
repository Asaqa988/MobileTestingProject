import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyTestCases {
	
	
	// mobile 
	
	DesiredCapabilities caps = new DesiredCapabilities();
	
String AppiumURL = "http://127.0.0.1:4723/wd/hub";

	
	 AndroidDriver driver  ;

	
	@BeforeTest
	public void mySetup() {
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");;
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"roro");;
		File myApplication = new File("src/applications/calculator.apk");
		
		caps.setCapability(MobileCapabilityType.APP,myApplication.getAbsolutePath());;
		
		
	}
	
	
	@Test()
	public void myFirstTest() throws MalformedURLException {
		
		driver = new AndroidDriver(new URL(AppiumURL), caps);
		
		
	}
	

}
