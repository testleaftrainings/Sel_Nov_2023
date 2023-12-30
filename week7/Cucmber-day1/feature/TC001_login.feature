Feature: Login Funtionality of Leaftaps application

#To configure common precondtion for all scenarios
Background:
Given Launch the browser
And Load the url

#Drawback-->can not be accessed by other feature file



Scenario: Login funtionality with positive Credentials

#preCondition
#Given Launch the browser
#And Load the url
And Enter the username as 'demoCSR'
And Enter the password as 'crmsfa'
# testCondition
When  Click on Login button
# expected postive result
Then  Welcome page is displayed


Scenario: Login funtionality with Invalid Credentials

#preCondition
#Given Launch the browser
#And Load the url
And Enter the username as 'demo@123'
And Enter the password as 'crmsfa'
# testCondition
When  Click on Login button
# expected postive result
But Error message is displayed