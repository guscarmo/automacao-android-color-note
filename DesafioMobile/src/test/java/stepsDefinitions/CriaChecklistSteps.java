package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;

public class CriaChecklistSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	
	ChecklistPage checklist = new ChecklistPage(driver);
	
	@Quando("acionar a opcao checklist")
	public void acionarAOpcaoChecklist() {
		colornote.acionarMenuChecklist();	
	}

	@Quando("acionar a opcao Add item")
	public void acionarAOpcaoAddItem() {
	    checklist.acionarBotaoAddItem();
	}
	
	@Quando("no menu Add Item digitar o texto {string}")
	public void noMenuAddItemDigitarOTexto(String textochecklist) {
	    checklist.inserirTextoChecklist(textochecklist);
	}
	
	@Quando("no menu Add Item acionar o botao ok")
	public void noMenuAddItemAcionarOBotaoOk() {
	    checklist.acionarBotaoOk();
	    
	}

	@Entao("com o checklist aberto esta os tres checks que criei {string} {string} {string}")
	public void comOChecklistAbertoEstaOsTresChecksQueCriei(String checkser, String checkresi, String checkeu) {
		try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ie) {	
	    }
	    assertEquals(checkeu, driver.findElement(By.xpath("//android.widget.TextView[@text = 'Eu quero, eu posso']")).getText());
	    assertEquals(checkser, driver.findElement(By.xpath("//android.widget.TextView[@text = 'Ser um stefaniner']")).getText());
	    assertEquals(checkresi, driver.findElement(By.xpath("//android.widget.TextView[@text = 'Resiliencia']")).getText());
	}


}
