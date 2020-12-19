package codemster;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

//import org.testng.Assert;
//import org.testng.annotations.Test;

public class webautomationone {
	

    public static void main(String[] args) {
    	
     
				
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mMARUF\\Downloads\\Compressed\\New folder\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
            
		    String baseUrl = "https://www.demoblaze.com/index.html";
		    driver.get(baseUrl);
		    
		     
		    driver.manage().window().maximize();
		    
		    
		    
		     JavascriptExecutor js = (JavascriptExecutor)driver;	
		     WebElement button =driver.findElement(By.id("signin2"));	
		     js.executeScript("arguments[0].click();", button);
		     
		    
		     WebElement username = driver.findElement(By.id("sign-username"));
		     username.sendKeys("maruf");	
		     
			
		     WebElement pas = driver.findElement(By.id("sign-password"));
		     pas.sendKeys("maruf");	       
   
		     
		     driver.findElement(By.cssSelector("btn btn-primary")).submit();
		     
		     // adding mobile  to cart
		     driver.findElement(By.cssSelector("card-img-top img-fluid")).submit();
		     driver.findElement(By.cssSelector("btn btn-success btn-lg")).submit();
		     
		     // adding laptop to cart
		     driver.findElement(By.cssSelector("card-img-top img-fluid")).submit();
		     driver.findElement(By.cssSelector("btn btn-success btn-lg")).submit();
		     
		     
		     // go to cart 
		     driver.findElement(By.cssSelector("nav-link")).submit();
		     
		     
		     // place order
		     driver.findElement(By.cssSelector("btn btn-success")).submit();
		     
		     WebElement name = driver.findElement(By.id("name"));
		     pas.sendKeys("maruf");	
		     WebElement country = driver.findElement(By.id("country"));
		     pas.sendKeys("Bangladesh");	
		     WebElement city = driver.findElement(By.id("city"));
		     pas.sendKeys("Dhaka");	
		     WebElement card = driver.findElement(By.id("card"));
		     pas.sendKeys("54312568905343");	
		     WebElement year = driver.findElement(By.id("year"));
		     pas.sendKeys("2020");	
		     
	
		   
		    		 
		    		
		     
		     driver.findElement(By.cssSelector("btn btn-primary")).submit();		 
		     
		     JavascriptExecutor js3 = (JavascriptExecutor)driver;	
		     WebElement logout =driver.findElement(By.id("logout2"));	
		     js3.executeScript("arguments[0].click();", logout);
		     
		     
		     
    }
    
    
}
