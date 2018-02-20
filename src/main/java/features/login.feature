Feature: Free CRM Login Feature

#without Examples Data Driven approach
#Scenario: Free CRM Login Test Scenario
#
#Given User is already on login page
#When title of login page is Free CRM
#Then User enter "naveenk" & "test@123"
#And user clicks on login button
#Then user is on home page
#And close the site

#with Examples 
Scenario Outline: Free CRM Login Test Scenario

Given User is already on login page
When title of login page is Free CRM
Then User enter "<username>" & "<password>"
And user clicks on login button
Then user is on home page
And close the site

Examples:
 
 | username | password |
 | naveenk  | test@123 |
 
 @Tagtest
 Scenario: This is tag Test
 Given test method
  
 Scenario: This 2nd tag test
 Given some method
  