package qi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SiteQi {

    static WebDriver driver;

    public SiteQi(WebDriver driver) {

        this.driver = driver;
    }

    public void preencherCampoSiteQi() {

        WebElement nome = driver.findElement(By.id("form-field-nome"));
        nome.sendKeys("Antonio Campos");

        WebElement email = driver.findElement(By.id("form-field-email"));
        email.sendKeys("antoniomallmann01@gmail.com");

        WebElement telefone = driver.findElement(By.id("form-field-telefone"));
        telefone.sendKeys("5193275483");

        WebElement cpf = driver.findElement(By.id("form-field-cpf"));
        cpf.sendKeys("123456789111");

        WebElement cidade = driver.findElement(By.id("form-field-cidade"));
        Select objCidade = new Select(driver.findElement(By.id("form-field-cidade")));
        objCidade.selectByVisibleText("Porto Alegre");

        WebElement solicitacao = driver.findElement(By.id("form-field-solicitacao"));
        Select objSolicitacao = new Select(driver.findElement(By.id("form-field-solicitacao")));
        objSolicitacao.selectByVisibleText("Solicitação");

        WebElement mensagem = driver.findElement(By.id("form-field-mensagem"));
        mensagem.sendKeys("Olá!\n" +
                "\n" +
                "Teste.\n" +
                "\n" +
                "Por favor, pode respondê-lo como \"recebido\", os dados são verdadeiros.\n" +
                "\n" +
                "Obrigado pela ajud.\n" +
                "\n" +
                "Antonio.\n");

        WebElement btAvancar = driver.findElement(By.xpath("//span[contains(text(),'Pronto, quero enviar a mensagem')]"));
        btAvancar.click();

    }
}