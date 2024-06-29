package pages.negativas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenha {

    static WebDriver driver;

    public CadastroSenha(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {

        WebElement name = driver.findElement(By.name("Passwd"));
        name.sendKeys("henriquecampos0142811");

        WebElement nameConfirm = driver.findElement(By.name("PasswdAgain"));
        nameConfirm.sendKeys("henriquecampos0142810");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

    }

    public String validarMensagemGoogleSenha() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Digite uma senha')]")));
        return driver.findElement(By.xpath("//span[contains(text(),'Digite uma senha')]")).getText();
    }
}
