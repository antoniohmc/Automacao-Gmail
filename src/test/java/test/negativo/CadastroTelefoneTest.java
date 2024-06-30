package test.negativo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.negativas.CadastroTelefone;
import pages.positivas.*;

public class CadastroTelefoneTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroTelefone cadastroTelefone;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenha = new CadastroSenha(driver);

        cadastroTelefone = new CadastroTelefone(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherCampo();
        cadastroEmail.preencherCampo();
        cadastroSenha.preencherCampo();

        CadastroTelefone.validarMensagemGooglePhone();

    }

    @After
    public void tearDown() throws Exception {
    }
}

