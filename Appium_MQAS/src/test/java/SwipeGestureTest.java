import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeGestureTest {
@Test
	
	public void launch() throws Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//Identify specific device
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		
		//To open perticular app
		
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL u = new URL("http://localhost:4723");
		 AndroidDriver driver = new AndroidDriver(u,dc);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Gallery']")).click();
		 driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		 
		 
		//this method used to swipe the screen
		 
		 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				    "left", 400, "top", 300, "width", 600, "height", 300,
				    "direction", "left",
				    "percent", 0.5
				));

		 driver.quit();
}
}
