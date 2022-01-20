package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class pageElements {

     static WebElement element=null;
	
	public static WebElement enter_Googletextbox(WebDriver Driver) 
		{
	          element= Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	          return element;
		}
	
	public static WebElement click_Googletextbox(WebDriver Driver)
	{
	          element=  Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	          return element;
		}
	
	public static WebElement click_Website(WebDriver Driver)
	{
	          element= Driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
	          return element;
		}
	public static WebElement enter_AmezonTexbox(WebDriver Driver)
	{
	          element= Driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	          return element;
		}
	public static WebElement click_AmezonTexbox(WebDriver Driver) {
	
	          element=Driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	          return element;
	}
	
}
