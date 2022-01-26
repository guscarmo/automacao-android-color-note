package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;
import pageObjects.TextPage;

public class AdicionarLembreteSteps {
	
	ColorNotePage colornote = new ColorNotePage(driver);
	TextPage textpage = new TextPage(driver);
	ChecklistPage checklist = new ChecklistPage(driver);
	
	@Quando("entrar nas opcoes")
	public void entrarNasOpcoes() {
	    checklist.acionarMore();
	}

	@Entao("acionar reminder para lembrete em quinze minutos")
	public void acionarReminderParaLembreteEmQuinzeMinutos() {
	    checklist.acionarReminder15Minutos();
	    try{
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ie) {	
	    }
	  }


	@Entao("o lembrete e acionado")
	public void oLembreteEAcionado() {
	    assertTrue(driver.findElement(By.id("com.socialnmobile.dictapps.notepad.color.note:id/datetime_absolute")).isDisplayed());
	}

}
