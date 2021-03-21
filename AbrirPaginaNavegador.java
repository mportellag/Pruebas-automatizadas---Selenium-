package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirPaginaNavegador {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automationChoucair\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(url);
		
		String title = driver.getTitle();
		
		if(title.contentEquals("My Store"))
		{
			System.out.println("Se ingresó correctamente al sitio web");
		} else {
			
			System.out.println("NO Se ingresó correctamente al sitio web");
		}
		driver.close();
	}
}
