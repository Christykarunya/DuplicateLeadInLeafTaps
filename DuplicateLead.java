package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Email")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='emailAddress']")).sendKeys("christykarunya90@gmail.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text' and @name='firstName'])[3]")).sendKeys("Hello");
		driver.findElement(By.xpath("(//input[@type='text' and @name='lastName'])[3]")).sendKeys("World");
		Thread.sleep(4000);
		
		//String firstName = driver.findElement(By.xpath("//input[@type='text' and @name='firstName'])[3]")).getText();
		//System.out.println(firstName);
		
		
		driver.findElement(By.xpath("//button[@type='button' and text()='Find Leads']")).click();
		Thread.sleep(4000);
		
		String firstName = driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=11033' and @class='linktext'])[3]")).getText();
		System.out.println(firstName);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='linktext' and text()='11033']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		System.out.println(text);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		
		String firstNameDup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstNameDup);
		Thread.sleep(2000);
		
		//driver.close();	

	}

}
