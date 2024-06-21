package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdade {

    static WebDriver driver;

    public CadastroIdade(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("24");

        WebElement monthElement = driver.findElement(By.id("month"));
        Select month = new Select(monthElement);
        monthElement.sendKeys("Setembro");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2002");

        WebElement genderEllements = driver.findElement(By.id("gender"));
        Select gender = new Select(genderEllements);
        genderEllements.sendKeys("Homem");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait waitPg3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitPg3.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[contains(text(), 'Como você fará o login')]")));
    }
}
