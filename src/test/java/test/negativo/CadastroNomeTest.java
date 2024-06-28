package test.negativo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.negativas.CadastroNome;

import static org.junit.Assert.assertEquals;


public class CadastroNomeTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroNome.preencherCampo();
        String mensagemEsperada = "Digite o nome";
        String mensagemAtual = cadastroNome.ValidarMensagemGoogle();
        assertEquals(mensagemEsperada, mensagemAtual);
    }


    @After
    public void tearDown() throws Exception {
    }
}
