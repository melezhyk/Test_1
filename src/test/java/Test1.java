import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

    WebElement singUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        singUp.click();

    WebElement zipCodeField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipCodeField.sendKeys("12345");

    WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        btnContinue.click();

    WebElement firstNameField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstNameField.sendKeys("Elena");

    WebElement lastNameField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastNameField.sendKeys("Melezhyk");

    WebElement emailField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        emailField.sendKeys("melezhyk@gmail.com");

    WebElement passwordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        passwordField.sendKeys("123Qwerty");

    WebElement confPasswordField = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confPasswordField.sendKeys("123Qwerty");

    WebElement btnRegister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        btnRegister.click();

    Thread.sleep(5000);

       driver.close();

       driver.quit();

    }
}
