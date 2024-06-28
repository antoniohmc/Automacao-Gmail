package pages.positivas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroSenha {

    static WebDriver driver;

    public CadastroSenha(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebElement passwd = driver.findElement(By.name("Passwd"));
        passwd.sendKeys("henriquecampos11");

        WebElement passwdAgain = driver.findElement(By.name("PasswdAgain"));
        passwdAgain.sendKeys("henriquecampos11");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String ValidarMensagemGoogle() {
        return driver.findElement(By.xpath("*//span[contains(text(),'Confirme que você não é um robô')]")).getText();
    }
}
