package automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlujoCompra {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automationChoucair\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		driver.findElement(By.cssSelector("#search_query_top ")).sendKeys("Printed");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		Thread.sleep(2000);
		
		WebElement ProductoCart = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/span[1]/span[1]"));
		Actions actionProvider = new Actions(driver);
		actionProvider.moveToElement(ProductoCart).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/div[2]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		WebElement CheckBoxShipping = driver.findElement(By.cssSelector("#cgv"));
		CheckBoxShipping.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		
		String CompraExitosa = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]/strong[1]")).getText();
		Thread.sleep(2000);
		
		if(CompraExitosa.contentEquals("Your order on My Store is complete."))
		{
			System.out.println("La compra se hizo exitosamente");
		}else {
			System.out.println("La compra ha fracasado");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

	}

