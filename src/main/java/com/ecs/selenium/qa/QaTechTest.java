
package com.ecs.selenium.qa;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import com.ecs.selenium.qa.Equilibrium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class QaTechTest { 
	
	public static void main(String[] args) {
		Equilibrium equilibrium = new Equilibrium();
		QaTechTest qaTechTest = new QaTechTest();
		
		System.setProperty("webdriver.chrome.driver", "C:\\DriversForSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:3000/");
		driver.findElement(By.xpath("//span[contains(text(),'Render the Challenge')]")).click();
		String r1=driver.findElement(By.xpath("//tbody//tr[1]")).getText();
		
		System.out.println("Index:"+equilibrium.getIndex(qaTechTest.getIntArray(r1)));
		String r2=driver.findElement(By.xpath("//tbody//tr[2]")).getText();
		System.out.println("Index:"+equilibrium.getIndex(qaTechTest.getIntArray(r2)));
		String r3=driver.findElement(By.xpath("//tbody//tr[3]")).getText();
		System.out.println("Index:"+equilibrium.getIndex(qaTechTest.getIntArray(r3)));
	}

	public int[] getIntArray(String str){
		
		String temp[]=str.split(" ");
		return Arrays.asList(temp).stream().mapToInt(Integer::parseInt).toArray();
		
	}
}
