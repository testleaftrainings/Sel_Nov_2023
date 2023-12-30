Feature: Createlead Funtionality of Leaftaps application

Background:
Given Launch the browser
And Load the url

Scenario Outline: Createlead funtionality with Mandatory fields

#preCondition
#Given Launch the browser
#And Load the url
And Enter the username as 'demoCSR'
And Enter the password as 'crmsfa'
# testCondition
When  Click on Login button
# expected postive result
Then  Welcome page is displayed
When Click on CRMSFA link
When Click on Leads link
When Click on Create Lead link
When Enter the companyName as <cname>
When Enter the firsName as <fname>
When Enter the lastName as <lname>
When Click on Create button
Then Viewlead page is displayed


Examples:
|cname|fname|lname|
|'Testleaf'|'Vidya'|'R'|
|'Wipro'|'Peter'|'A'|



Scenario Outline: Createlead funtionality with Mandatory fields

#preCondition
#Given Launch the browser
#And Load the url
And Enter the username as 'demoCSR'
And Enter the password as 'crmsfa'
# testCondition
When  Click on Login button
# expected postive result
Then  Welcome page is displayed
When Click on CRMSFA link
When Click on Leads link
When Click on Create Lead link
When Enter the companyName as <cname>
When Enter the firsName as <fname>
When Enter the lastName as <lname>
When Click on Create button
Then Viewlead page is displayed


Examples:
|cname|fname|lname|
|'Testleaf'|'Vidya'|'R'|
|'Wipro'|'Peter'|'A'|
