import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_001 {
@Test
	
	public void launch() throws Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//Identify specific device
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		//beloe lines are used to unlock the device
		
		dc.setCapability("unlockType", "pin");
		dc.setCapability("unlockKey", "123456");
		
		//To open perticular app
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL u = new URL("http://localhost:4723");
		 AndroidDriver driver = new AndroidDriver(u,dc);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Prabhat Shetty");
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
		 //scroll unti the product
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
		 driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='ADD TO CART'])[3]")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 String producttexts = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productName")).getText();
		 

		 
		 
		 Assert.assertEquals("Nike SFB Jungle", producttexts, "Passinggggggggg");

		 



		 
		 

		
		// com.androidsample.generalstore:id/spinnerCountry
		 
		 //uiautomator scroll gesture
		 

		 
		 
		 driver.quit();
}
}
