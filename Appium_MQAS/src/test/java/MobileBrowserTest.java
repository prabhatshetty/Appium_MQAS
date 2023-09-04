import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTest {
	@Test

	public void launch() throws Throwable {

		//	DesiredCapabilities dc=new DesiredCapabilities();
		DesiredCapabilities dc = new DesiredCapabilities();
		//Identify specific device
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		//dc.setCapability(MobileCapabilityType.UDID,"e434dac9");
		// used to launch browser
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		//dc.setCapability(MobileCapabilityType.BROWSER_VERSION, "106.0.5249.126");
		//dc.setCapability("driverExecutable","C:Users/User/Downloads/chromedriver.exe");
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://gmail.com");

	}
}
