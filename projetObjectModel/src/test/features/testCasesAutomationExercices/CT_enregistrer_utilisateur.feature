@Register
Feature: enregistrer un utilisateur

  je veux enregistrer un nouveau utilisateur

  @RegisterUser
  Scenario: enregistrer un nouveau utilisateur
    
    Given saisir url exercice "http://automationexercise.com "
    Then Verifiez que la page d accueil est bien visible
    When cliquez sur le bouton « Inscription/Connexion »
    Then verifiez que « Inscription d un nouvel utilisateur ! » est visible
    When Entrez le nom "nathalie" et l adresse e-mail "nathalie1234@gmail.com"
    And Cliquez sur le bouton « S inscrire »
    Then verifiez que « SAISIR LES INFORMATIONS DU COMPTE » est visible
    When Remplissez les détails : Titre "Mme" et Nom "nathalie" et E-mail "nathalie1234@gmail.com" et Mot de passe "Nathalie.123"
    And Cochez la case « Inscrivez-vous à notre newsletter ! »
    And Cochez la case « Recevez des offres spéciales de nos partenaires ! »
    And Remplissez les détails : Prenom "nathalie", Nom "brun", Societe "white street" , Adresse "297 River Street", Adresse "street", Pays "Canada", État "ON est la province", Ville "Toronto", Code postal "M5A1B5", Numero de portable "416 555 1234" 
    And Cliquez sur le bouton « Créer un compte »
    Then Vérifiez que « COMPTE CRÉÉ ! » est visible
    When Cliquez sur le bouton « Continuer »
    Then Vérifiez que « Connecté avec le nom d utilisateur » est visible
    When Cliquez sur le bouton « Supprimer le compte »
    Then Vérifiez que « COMPTE SUPPRIMÉ ! » est visible et cliquez sur le bouton « Continuer »
    
    
    
   

  

  