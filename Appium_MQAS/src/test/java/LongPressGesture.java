import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LongPressGesture {

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
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		 driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		 WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dog Names']"));
		
		//((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of()"elementId", (RemoteWebElement) element).getId(),"duration",2000));
		 
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId() ,"duration",2000
			));
	
		String sampletexts = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		//android.widget.TextView[@text='Sample menu']
		Assert.assertEquals("Sample menu", sampletexts, "Passinggggggggg");
		
		 driver.quit();
		
}
}
