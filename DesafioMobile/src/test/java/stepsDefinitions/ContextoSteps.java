package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;
import pageObjects.TextPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

public class ContextoSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	TextPage textpage = new TextPage(driver);
	ChecklistPage checklist = new ChecklistPage(driver);
	
	@Dado("que eu criei a nota com o texto {string}")
	public void queEuCrieiANotaComOTexto(String formacaoQA) {
		colornote.acionarAdd();
		colornote.acionarMenuText();	    
		textpage.digitarTexto(formacaoQA);	    
		textpage.acionarBotaoOk();
		textpage.acionarBotaoOk();
		colornote.acionarAdd();
		colornote.acionarMenuChecklist();
		
	}
	

	@Dado("criei um checklist com o titulo {string}")
	public void crieiUmChecklistComOTitulo(String metas) {
		checklist.inserirTitulo(metas);
	}

	@Dado("criei o checklist {string}")
	public void crieiOChecklist(String metas) {
		
		checklist.acionarBotaoAddItem();
		checklist.inserirTextoChecklist(metas);
		checklist.acionarBotaoOk();
	}
	
	@Entao("com a nota e os tres checklist criados volta para a tela principal do sistema")
	public void comANotaEOsTresChecklistCriadosVoltaParaATelaPrincipalDoSistema() {
		textpage.acionarBotaoOk();
		try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ie) {	
	    }
	    assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Eu quero, eu posso']")).isDisplayed());
	    assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Ser um stefaniner']")).isDisplayed());
	    assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'Resiliencia']")).isDisplayed());
		textpage.acionarBotaoOk();
		
	}
}
