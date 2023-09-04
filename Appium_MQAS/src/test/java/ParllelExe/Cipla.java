package ParllelExe;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cipla {
	
	@Test

	public void launch() throws Throwable {

		DesiredCapabilities dc=new DesiredCapabilities();
		//Identify specific device

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		//beloe lines are used to unlock the device

		//dc.setCapability("unlockType", "pin");
		//dc.setCapability("unlockKey", "123456");

		//To open perticular app

		dc.setCapability("appPackage", "breathefree.lung.health.asthma.breathing");
		dc.setCapability("appActivity", ".MainActivity");

		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Allow']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Mobile number*']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Mobile number']")).sendKeys("9482928782");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue']")).click();
		Thread.sleep(15000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Verify']")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Diary']")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sleep\"));"));
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sleep']")).click();
		
		
		
		//driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
	
	}
}
