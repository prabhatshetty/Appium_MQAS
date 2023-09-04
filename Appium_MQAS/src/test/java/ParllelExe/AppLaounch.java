package ParllelExe;
import java.net.URL;

import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GeneralSore.LoginPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLaounch {
	@Test
	public void launch() throws Throwable {
		
		//	DesiredCapabilities dc=new DesiredCapabilities();
			DesiredCapabilities dc = new DesiredCapabilities();
			//Identify specific device
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
			
			//To open perticular app
			
			
			dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity", ".SplashActivity");
			
			URL u = new URL("http://localhost:4723");
			 AndroidDriver driver = new AndroidDriver(u,dc);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']")).click();
			LoginPage login = new LoginPage(driver);
			 //GeneralSore.LoginPage login = new GeneralSore.LoginPage(driver);
			 
			 login.getCountrydropdown().click();
			 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
			 login.getCountryname().click();
			 login.Logink("Prabhat");
			 
			 //driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			 //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
			// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();
			// driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Prabhat Shetty");
			// driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			 
			 //scroll unti the product
			// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
	}
			
}
