package Rongdhonu_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Rongdhonu_Base {
	public static WebDriver driver;
	public static Properties prorong;
	
	public Rongdhonu_Base () {
		
	try {
		FileInputStream Rongfile = new FileInputStream(System.getProperty("user.dir")+ ("//src//test//java//Rongdhonu_Config//Rongdhonu_config.properties"));
		  prorong = new Properties();
		  prorong.load(Rongfile);
	} catch (FileNotFoundException e) {
		System.out.println("Please look the code");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("Please look the code");
		e.printStackTrace();
	}

}
	public void Rongbrowser() {
		     String rongAllbrowser=prorong.getProperty("RongBrowser1");
		 if(rongAllbrowser.equalsIgnoreCase("Chrome")){
			 System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Rongdhonu//Rongdhonu_ChromeDriver//chrome.exe"));
			  ChromeOptions naz= new ChromeOptions();
			  naz.addArguments("--remote-allow-origins=*");
			  
			  driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Rongdhonu_Utiliti.pageLoadTimout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Rongdhonu_Utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
			 
		 }
		 else if(rongAllbrowser.equalsIgnoreCase(" Edge")) {
			 System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Rongdhonu//Rongdhonu_EdgeDriver//msedgedriver.exe"));
			  EdgeOptions naz= new EdgeOptions();
			  naz.addArguments("--remote-allow-origins=*");
			  
			  driver= new EdgeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Rongdhonu_Utiliti.pageLoadTimout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Rongdhonu_Utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
			 
			 
		 }
	}
	public static void rongLaunchurl(String url) {
		driver.get(prorong.getProperty("RongUr2"));
	}
	
}	
	
	
	
