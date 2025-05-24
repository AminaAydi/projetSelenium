package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageSignUp_Login_Object;
import pageObject.page_home_product_object;

public class CT_enregistrer_utilisateur {
	
	WebDriver driver = SetUp.driver;
	page_home_product_object home = new page_home_product_object(driver);
	PageSignUp_Login_Object sign = new PageSignUp_Login_Object (driver);
	
			@Given("saisir url exercice {string}")
	public void saisir_url_exercice(String string) {
				home.acceder_a_url(string);
	  
	}

	@Then("Verifiez que la page d accueil est bien visible")
	public void verifiez_que_la_page_d_accueil_est_bien_visible() {
		Assert.assertTrue(home.img_auto_exercice.isDisplayed());
	}

	@When("cliquez sur le bouton « Inscription\\/Connexion »")
	public void cliquez_sur_le_bouton_inscription_connexion() {
	  home.cliquer_sur_le_bouton_signUp_Login();
	}

	@Then("verifiez que « Inscription d un nouvel utilisateur ! » est visible")
	public void verifiez_que_inscription_d_un_nouvel_utilisateur_est_visible() {
		Assert.assertTrue(sign.txt_new_user.isDisplayed());
	}

	@When("Entrez le nom {string} et l adresse e-mail {string}")
	public void entrez_le_nom_et_l_adresse_e_mail(String string, String string2) {
	    sign.saisir_un_username(string);
	    sign.saisir_un_email(string2);
	}

	@When("Cliquez sur le bouton « S inscrire »")
	public void cliquez_sur_le_bouton_s_inscrire() {
        sign.cliquer_sur_le_bouton_signUp();
	}

	@Then("verifiez que « SAISIR LES INFORMATIONS DU COMPTE » est visible")
	public void verifiez_que_saisir_les_informations_du_compte_est_visible() {
		Assert.assertTrue(sign.txt_account_information.isDisplayed());
	}

	@When("Remplissez les détails : Titre {string} et Nom {string} et E-mail {string} et Mot de passe {string} et jour {string} mois {string} et année {string}")
	public void remplissez_les_détails_titre_et_nom_et_e_mail_et_mot_de_passe_et_jour_mois_et_année(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	  sign.remplir_formulaire_part_1(string, string4);
	  Assert.assertEquals(sign.recuperer_nom_user(), string2);
		Assert.assertEquals(sign.recuperer_mail_user(), string3);
	}

	@When("Cochez la case « Inscrivez-vous à notre newsletter ! »")
	public void cochez_la_case_inscrivez_vous_à_notre_newsletter() {
	    
	}

	@When("Cochez la case « Recevez des offres spéciales de nos partenaires ! »")
	public void cochez_la_case_recevez_des_offres_spéciales_de_nos_partenaires() {
	   
	}

	@When("Remplissez les détails : Prenom {string}, Nom {string}, Societe {string} , Adresse {string}, Adresse {string}, Pays {string}, État {string}, Ville {string}, Code postal {string}, Numero de portable {string}")
	public void remplissez_les_détails_prenom_nom_societe_adresse_adresse_pays_état_ville_code_postal_numero_de_portable(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {

	}

	@When("Cliquez sur le bouton « Créer un compte »")
	public void cliquez_sur_le_bouton_créer_un_compte() {
	    
	}

	@Then("Vérifiez que « COMPTE CRÉÉ ! » est visible")
	public void vérifiez_que_compte_créé_est_visible() {
	    
	}

	@When("Cliquez sur le bouton « Continuer »")
	public void cliquez_sur_le_bouton_continuer() {
	   
	}

	@Then("Vérifiez que « Connecté avec le nom d utilisateur » est visible")
	public void vérifiez_que_connecté_avec_le_nom_d_utilisateur_est_visible() {
	   
	}

	@When("Cliquez sur le bouton « Supprimer le compte »")
	public void cliquez_sur_le_bouton_supprimer_le_compte() {
	    
	}

	@Then("Vérifiez que « COMPTE SUPPRIMÉ ! » est visible et cliquez sur le bouton « Continuer »")
	public void vérifiez_que_compte_supprimé_est_visible_et_cliquez_sur_le_bouton_continuer() {
	   
	}

}
