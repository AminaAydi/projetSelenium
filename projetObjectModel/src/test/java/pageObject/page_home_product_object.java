package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class page_home_product_object {

	public WebDriver driver;
	
	/****************************creation d'un constructeur******************/
	public page_home_product_object (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*************************identification des elements (design pattern)********************/
	@FindBy ( how = How.XPATH , using ="//img[@alt='Website for automation practice']")
	public WebElement img_auto_exercice;
	
	@FindBy ( how = How.XPATH , using = "//a[@href='/login']")
	WebElement bt_connexion_inscription;
	
	/*********************************creation des methodes*******************/
	public void acceder_a_url(String url) {
		driver.get(url);
	}
	public void cliquer_sur_le_bouton_signUp_Login() {
		bt_connexion_inscription.click();
	}
	
}



