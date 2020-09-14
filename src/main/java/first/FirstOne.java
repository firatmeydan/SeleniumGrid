package first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstOne {
public static void main(String[] args) throws MalformedURLException {
	
	DesiredCapabilities desired=new DesiredCapabilities();
	
	desired.setBrowserName("chrome");
	desired.setPlatform(Platform.MAC);
	
	String url="http://192.168.0.3:4444/wd/hub";
	
	ChromeOptions co=new ChromeOptions();
	
	co.merge(desired);
	
	WebDriver driver=new RemoteWebDriver(new URL(url), co);
	
	driver.get("https://www.aktifhaber.com");
	
	System.out.println("Title is "+driver.getTitle());
	
	driver.close();
	
}
}
