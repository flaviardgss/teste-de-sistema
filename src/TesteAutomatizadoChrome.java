import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizadoChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com.br");
		WebElement textArea = driver.findElement(By.name("q"));
		textArea.sendKeys("Caelum");
		textArea.submit();
	}
}