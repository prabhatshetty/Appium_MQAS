package ParllelExe;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStackTest {
	
	
	static final String username="pavitra11";
	static final String accessKey="qBVzk9xiZkdvvPonsvxa";
	static final String url="https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void  mobileBrowser() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 6");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("build", "1.1.0.1");
		dc.setCapability("name","MobileBrowser_Automate");
		URL u = new URL(url);
		WebDriver driver = new RemoteWebDriver(u, dc);
		driver.get("https://www.bira91.com/");
	}
}
