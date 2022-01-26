package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TextPage {
	
	public TextPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
	private MobileElement campoTexto;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement botaoOk;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_btn")
	private MobileElement botaoEditar;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/color_btn")
	private MobileElement botaoCor;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/txt5")
	private MobileElement botaoCorAzul;
	
	
	public void digitarTexto(String formacaoQA) {
		campoTexto.sendKeys(formacaoQA);
	}
	
	public void acionarBotaoOk() {
		botaoOk.click();
	}
	
	public void acionarBotaoEditar() {
		botaoEditar.click();
	}
	
	public void acionarBotaoCor() {
		botaoCor.click();
	}
	
	public void acionarBotaoCorAzul() {
		botaoCorAzul.click();
	}
	
}
