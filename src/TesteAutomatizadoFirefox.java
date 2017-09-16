
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizadoFirefox {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Documents\\Selenium\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com.br");
        WebElement textArea = driver.findElement(By.name("q"));
        textArea.sendKeys("Caelum");

        textArea.submit();

    }
}
