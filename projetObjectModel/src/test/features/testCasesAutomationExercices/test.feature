
@tag
Feature: enregistrer un utilisateur

  je veux enregistrer un nouveau utilisateur
  
  Background: 
  
   Given saisir url exercice "http://automationexercise.com "
    Then Verifiez que la page d accueil est bien visible

  @tag1
  Scenario: enregistrer un nouveau utilisateur
   When cliquez sur le bouton « Inscription/Connexion »
    Then verifiez que « Inscription d un nouvel utilisateur ! » est visible
    When Entrez le nom "nathalie" et l adresse e-mail "nathalie1234@gmail.com"
    And Cliquez sur le bouton « S inscrire »


   