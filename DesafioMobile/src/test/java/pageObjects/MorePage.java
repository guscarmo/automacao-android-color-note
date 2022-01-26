package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MorePage {
	
	public MorePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Trash Can']")
	private MobileElement botaoLixeira;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/main_btn1")
	private MobileElement botaoEsvaziarLixeira;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement botaoOkEsvaziarLixeira;
	
	public void acionarLixeira() {
		botaoLixeira.click();
	}
	
	public void esvaziarLixeira() {
		botaoEsvaziarLixeira.click();
		botaoOkEsvaziarLixeira.click();
	}

}

