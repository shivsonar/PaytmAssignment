package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHIVSONAR\\Desktop\\chromedriver114\\chromedriver.exe");
		 
   WebDriver driver=new ChromeDriver();
  // JavascriptExecutor js=(JavascriptExecutor)driver;

   driver.get("https://tickets.paytm.com/flights/");
   
   driver.findElement(By.xpath("//label[@for='oneWay']")).click(); 
   Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@id='text-box'])[1]")).click(); 	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Delhi,']")).click();  			
	driver.findElement(By.xpath("(//input[@id='text-box'])[2]")).click();  
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[normalize-space()='Hyderabad,']")).click();
	
	driver.findElement(By.xpath("//input[@name='Departure-Date']")).click();  
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[contains(text(),'21')])[2]")).click();
	//driver.findElement(By.xpath("(//input[@name='Return-Date']")).click(); 
//driver.findElement(By.xpath("((//div[contains(text(),'21')])[1]")).click(); 
	
	driver.findElement(By.xpath("(//input[@id='text-box'])[3]")).click(); 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='economy']")).click();
	
	driver.findElement(By.cssSelector("button[tabindex='0']")).click(); 
	
	Thread.sleep(2000);
	
	 
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("(//a[contains(text(),'Book')])[15]")).click();
	 
	 
	 String parentWindow = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
		    if (!windowHandle.equals(parentWindow)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		

	//	driver.findElement(By.cssSelector("a._1mvLksqBDbXvIRjc9YWvF.x-link")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Login to continue →']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id=\"email_mobile_login\"]")).sendKeys("6366126870");
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/div/div/button")).click();
		
		
		// Scanner scanner = new Scanner(System.in);
		 //System.out.println("Enter the OTP:");
		 
		 //String OTP=scanner.next();
		 
		
//		 System.out.println("OTP");
//		 driver.findElement(By.xpath("//*[@id=\"otp_login\"]")).sendKeys(OTP);
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/span/div/div/div[2]/span/a")).click();
		
		 Thread.sleep(10000);
         driver.switchTo().defaultContent();
        // driver.findElement(By.xpath("//*[@id=\"add-new-traveller-adult\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"flights-review-traveller-details\"]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]")).click();		
		// js.executeScript("window.scrollBy(0,1000)");
		 
		//js.executeScript("window.scrollBy(0,1000)");
	
		
		driver.findElement(By.xpath("//*[@id=\"text-box\"]")).sendKeys("Shiv");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[4]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys("Prasad");
		//driver.findElement(By.xpath("//*[@id=\"flights-review-traveller-details\"]/div[2]/div[2]/div/div[3]/div/button")).click();		
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[4]/div[2]/div[2]/div/div[3]/div/button")).click();
		
		//	System.out.println("login is required...........");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div[1]/div[5]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/span")).click();
		
	//List scanner = driver.findElements(By.className("_2AV5"));
		
		List<WebElement> meals = driver.findElements(By.className("_2AV5"));
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		}
		
		}

	
	
		

	
