package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSignUp_Login_Object {
	public WebDriver driver;
	
/****************************creation d'un constructeur******************/
	
	public PageSignUp_Login_Object  (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*************************identification des elements (design pattern)********************/
	@FindBy (how = How.XPATH , using ="//h2[text()='New User Signup!']")
	public WebElement txt_new_user;
	@FindBy (how = How.XPATH , using = "//input[@data-qa='signup-name']")
	WebElement name;
	@FindBy (how = How.XPATH , using = "//input[@data-qa='signup-email']")
	WebElement email;
	@FindBy (how = How.XPATH , using ="//button[@data-qa='signup-button']")
	WebElement bt_signup;
	@FindBy (how = How.XPATH , using ="//b[text()='Enter Account Information']")
	public WebElement txt_account_information;
	@FindBy (how = How.XPATH , using ="//input[@id='id_gender2']")
	WebElement bt_title_mme;
	@FindBy (how = How.XPATH , using ="//input[@id='id_gender1']']")
	WebElement bt_title_mr;
	@FindBy (how = How.XPATH , using ="//input[@data-qa='name']']")
	WebElement txt_name;
	@FindBy (how = How.XPATH , using ="//input[@data-qa='email']") 
	WebElement txt_mail;
	@FindBy (how= How.XPATH , using ="//input[@data-qa='password']")
	WebElement txt_password;
	/*********************************creation des methodes*******************/
	//si on va utiliser la methode du get txt donc on va creer une methode pour recuperer le txt
	public String get_new_user() {
		String var = txt_new_user.getText();
		return var;
	}
	//saisir user name et le mail
	public void saisir_un_username(String user) {
		name.sendKeys(user);
		
	}
	public void saisir_un_email(String mail) {
		email.sendKeys(mail);
	}
		//cliquer sur le bouton sign_up
		public void cliquer_sur_le_bouton_signUp() {
			bt_signup.click();
			
		}
		
	public void remplir_formulaire_part_1(String sexe, String pass) {
		if (sexe.equals("Mme")) {	
			bt_title_mme.click();
		}
		else {
			bt_title_mr.click();
		}
		
		txt_password.sendKeys(pass);
	}
	public String recuperer_nom_user() {
		String resultat_name = txt_name.getAttribute("value");
		return resultat_name;
	}
	public String recuperer_mail_user() {
		String resultat_mail = txt_mail.getAttribute("value");
		return resultat_mail;
	}
}
