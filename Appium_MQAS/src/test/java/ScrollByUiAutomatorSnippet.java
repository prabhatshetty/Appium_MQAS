import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollByUiAutomatorSnippet {
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
		 
		 //uiautomator scroll gesture
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
//////
		 driver.quit();
}
}
