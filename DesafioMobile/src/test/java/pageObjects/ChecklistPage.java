package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChecklistPage {
	
	public ChecklistPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/text")
	private MobileElement botaoAddItem;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit")
	private MobileElement campoTexto;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOk;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_title")
	private MobileElement campoTitulo;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Ser um stefaniner']")
	private MobileElement opcaoSerUmStefaniner;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Resiliencia']")
	private MobileElement opcaoResiliencia;
	
	@AndroidFindBy(accessibility = "More")
	private MobileElement opcaoMore;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Reminder']")
	private MobileElement opcaoReminder;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min")
	private MobileElement opcaoQuinzeMinutos;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/button1")
	private MobileElement opcaoDone;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Delete']")
	private MobileElement opcaoDelete;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement opcaoOkDelete;
	
	public void acionarBotaoAddItem() {
		botaoAddItem.click();
	}
	
	public void inserirTextoChecklist(String textochecklist) {
		campoTexto.sendKeys(textochecklist);
	}
	
	public void acionarBotaoOk() {
		botaoOk.click();
	}
	
	public void inserirTitulo(String metas) {
		campoTitulo.sendKeys(metas);
	}
	
	public void acionarOpcaoSerUmStefaniner() {
		opcaoSerUmStefaniner.click();
	}
	
	public void acionarOpcaoResiliencia() {
		opcaoResiliencia.click();
	}
	
	public void acionarMore() {
		opcaoMore.click();		
	}
	
	public void acionarReminder() {
		opcaoReminder.click();
	}
	
	public void acionarDone() {
		opcaoDone.click();
	}
	
	public void acionarReminder15Minutos() {
		opcaoReminder.click();
		opcaoQuinzeMinutos.click();
		opcaoDone.click();
	}
	
	public void deletaLista() {
		opcaoDelete.click();
		opcaoOkDelete.click();
	}
	
}
