package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;
import pageObjects.TextPage;

public class AlterarCorDaNotaSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	TextPage textpage = new TextPage(driver);
	ChecklistPage checklist = new ChecklistPage(driver);
		

	@Quando("que eu abri a nota")
	public void queEuAbriANota() {
		colornote.acionarNotaQA();
	}

	@Quando("eu editar a nota")
	public void euEditarANota() {
	    textpage.acionarBotaoEditar();
	    textpage.acionarBotaoCor();
	}

	@Quando("trocar de cor")
	public void trocarDeCor() {
		textpage.acionarBotaoCorAzul();
		textpage.acionarBotaoOk();
		textpage.acionarBotaoOk();
	}
	
	@Entao("filtro pela cor a azul e aparece a nota que editei")
	public void filtroPelaCorAAzulEApareceANotaQueEditei() {
		colornote.acionarBotaoFiltroCor();
		colornote.acionarBotaoFiltroAzul();
		assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Vou passar na Formacao de QA da Stefanini']")).isDisplayed());
		
	    
	}

}
