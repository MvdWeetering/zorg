Feature: vullen formulieren
  As a user
  I want to login to Caseware Tax engagement
  And open a project
  And fill out the form
  So that I can evaluate the form

  @Openen_Samenstel
  Scenario Outline: Openen Zorg
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the Zorg module
    And open the Project "test2"
    And Sluit browser
    
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |

     @Importeren_Jaarrekening 
  Scenario Outline: Openen Zorg
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the Zorg module
    And Create a new Zorgfile
  	And Importeer saldibalans
  	And Sluit browser
		 
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |

 @TEST_Zorg 
  Scenario Outline: Openen Zorg
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the Zorg module
    And Create a new Zorgfile 
    And in entity "Katinka"
    #And with name "Kat+date"
    #And open the Project "katimka"
    #And Importeer saldibalans
   	#And Sluit browser
		       
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |
        