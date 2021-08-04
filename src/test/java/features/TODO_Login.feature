@Todofeature
Feature: change background color to sky blue 

Background: 
	Given User is on the TODO list page 
	
@changetoskyblue1
Scenario: User should be able to change color to sky blue 
	When User clicks on the set sky blue background button  
	Then User should be able to see background change to sky blue 
	
