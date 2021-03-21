package automationpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automationChoucair\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#search_query_top")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#search_query_top ")).sendKeys("Printed");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/h1[1]/span[2]")).getText().contains("results have been found"))
		{
			System.out.println("La búsqueda se realizó correctamente");
		} else {
			
			System.out.println("La búsqueda NO se realizó correctamente");
		}
		
		driver.close();
	}

}
