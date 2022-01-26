package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ColorNotePage {
	
	public ColorNotePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(accessibility = "Add")
	private MobileElement teclaAdd;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Text']")
	private MobileElement menuText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Checklist']")
	private MobileElement menuChecklist;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Vou passar na Formacao de QA da Stefanini']")
	private MobileElement notaQA;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")
	private MobileElement botaoFiltroCor;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@bounds = '[546,928][952,1046]']")
	private MobileElement botaoFiltroAzul;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'metas']")
	private MobileElement checklistMetas;
	
	@AndroidFindBy(accessibility = "More")
	private MobileElement botaoMore;
	
	
	
	public void acionarAdd() {
		teclaAdd.click();		
	}
	
	public void acionarMenuText() {
		menuText.click();
	}
	
	public void acionarMenuChecklist() {
		menuChecklist.click();
	}
	
	public void acionarNotaQA() {
		notaQA.click();
	}
	
	public void acionarBotaoFiltroCor() {
		botaoFiltroCor.click();
	}
	
	public void acionarBotaoFiltroAzul() {
		botaoFiltroAzul.click();
	}
	
	public void acionarChecklistMetas() {
		checklistMetas.click();
	}
	
	public void acionarBotaoMore() {
		botaoMore.click();
	}
}


