package pages.positivas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNome {

    static WebDriver driver;

    public CadastroNome(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("Henrique");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Campos");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait waitPg2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        waitPg2.until(ExpectedConditions.presenceOfElementLocated(By.id("day")));
    }
}
