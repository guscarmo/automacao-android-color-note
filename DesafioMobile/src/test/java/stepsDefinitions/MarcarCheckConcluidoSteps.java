package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ChecklistPage;
import pageObjects.ColorNotePage;
import pageObjects.TextPage;

public class MarcarCheckConcluidoSteps {

	ColorNotePage colornote = new ColorNotePage(driver);
	TextPage textpage = new TextPage(driver);
	ChecklistPage checklist = new ChecklistPage(driver);


	@Dado("que acionei o checklist de metas")
	public void queAcioneiOChecklistDeMetas() {
		colornote.acionarChecklistMetas();
	}

	@Quando("acionar a meta Ser um stefaniner")
	public void acionarAMetaSerUmStefaniner() {
		checklist.acionarOpcaoSerUmStefaniner();
	}

	@Quando("Resiliencia")
	public void resiliencia() {
		checklist.acionarOpcaoResiliencia();
	}

	@Entao("marcar como concluido")
	public void marcarComoConcluido() {
		assertTrue(driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/image']")).isDisplayed());

	}

}
