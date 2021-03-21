package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automationChoucair\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		boolean NoLogado; 
		
		try { 
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")); 
			NoLogado = true;
		} catch (NoSuchElementException e) { 
			NoLogado = false; 
		}
		System.out.println("No se encuentra logado actualmente:" + NoLogado);
		
		if(NoLogado=true)
		{
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#email")).sendKeys("marco.portellafieeb12@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#passwd")).sendKeys("123456");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
		}
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contentEquals("My account - My Store"))
		{
			System.out.println("Se hizo el login con éxito");
		}else {
			System.out.println("El login ha fracasado");
		}
		driver.close();
	}
}
