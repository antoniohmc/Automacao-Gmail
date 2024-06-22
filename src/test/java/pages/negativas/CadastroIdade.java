package pages.negativas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdade {

    static WebDriver driver;

    public CadastroIdade(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait waitPg3 = new WebDriverWait(driver, Duration.ofSeconds(30));
        waitPg3.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[contains(text(), 'Como você fará o login')]")));
    }
}
