package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.pageElements;


public class ChromeOpen extends pageElements{
	
	
            static WebDriver Driver=null;
		    public static void main (String[] args) {
		   
		    Driver=new ChromeDriver();
		    Driver.get("https://www.google.com/");
		    pageElements.enter_Googletextbox(Driver).sendKeys("Amazon.com");
		    pageElements.click_Googletextbox(Driver).click();
		    pageElements.click_Website(Driver).click();
		    pageElements.enter_AmezonTexbox(Driver).sendKeys("laptops");
		    pageElements.click_AmezonTexbox(Driver).click();
			
		   }		
		
}

