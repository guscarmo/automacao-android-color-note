package stepsDefinitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;
import pageObjects.MorePage;
import pageObjects.TextPage;

public class ExcluirListaSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	TextPage textpage = new TextPage(driver);
	ChecklistPage checklist = new ChecklistPage(driver);
	MorePage morepage = new MorePage(driver);
	
	@Quando("acionar delete")
	public void acionarDelete() {
	    checklist.deletaLista();
	    
	}

	@Entao("a lista e enviada para a lixeira")
	public void aListaEEnviadaParaALixeira() {
		colornote.acionarBotaoMore();
		morepage.acionarLixeira();
		assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text = 'metas']")).isDisplayed());
	}
	
	@Entao("esvazia a lixeira")
	public void esvaziaALixeira() {
	    morepage.esvaziarLixeira();
	    try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ie) {	
	    }
	}


}
