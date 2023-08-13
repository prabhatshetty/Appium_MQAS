import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomIn {
	
@Test 
	
	public void launch() throws Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		//Identify specific device
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		
		//To open perticular app
		
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");
		
		URL u = new URL("http://localhost:4723");
		 AndroidDriver driver = new AndroidDriver(u,dc);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();
		 driver.findElement(AppiumBy.id("android:id/button1")).click();
		 driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		 WebElement element = driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		 // zoom in 
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),"percent", 0.75));
		
		//zoom out
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"percent", 0.75)); 
		
		
		
		// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
	     driver.quit();
		 
}

}
