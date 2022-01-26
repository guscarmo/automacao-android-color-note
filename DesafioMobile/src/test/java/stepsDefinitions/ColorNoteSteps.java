package stepsDefinitions;

import io.cucumber.java.pt.Dado;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ColorNotePage;
import pageObjects.TextPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ColorNoteSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	

	@Quando("eu acionar o botao mais")
	public void euAcionarOBotaoMais() {
	    colornote.acionarAdd();
	}

	@Quando("acionar a opcao text")
	public void acionarAOpcaoText() {
		colornote.acionarMenuText();	    
	}
	
	TextPage textpage = new TextPage(driver);
	
	@Quando("digitar o texto {string}")
	public void digitarOTexto(String formacaoQA) {
		textpage.digitarTexto(formacaoQA);	    
	}

	@Quando("acionar o botao ok")
	public void acionarOBotaoOk() {
	    textpage.acionarBotaoOk();
	}

	@Quando("apertar o botao voltar")
	public void apertarOBotaoVoltar() {
		textpage.acionarBotaoOk();
	}

	@Entao("apresenta na tela inicial do aplicativo minha nota de texto {string}")
	public void apresentaNaTelaInicialDoAplicativoMinhaNotaDeTexto(String formacaoQA) {
	    assertEquals(formacaoQA, driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/title")).getText());
	    
	}

	
	
}
