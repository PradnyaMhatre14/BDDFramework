Feature:  Registered and non Registered user will come on application and perform activities\
Scenario: Registered user come to application ,login and logout
Given     User is on login page
When      User enters username 
And       User enters password
And       User clicks on signin button
Then      User should be logged in
When      User click on logout button
Then      User should be logged out

Scenario: Non Registered user come to application,Register and login
Given     User is on Registered page
When      User enters username 
And       User enters email address
And       User enters password
And       User enters confirm password
And       User enters date of birth
And       User enters phone number
And       User enters address
And       User click on home Address Page
And       User select gender
And       User select Country
And       User select State
And       User select city
And       User enters Zipcode
And       User click on agree checkbox
And       User click on signup button
Then      User Account should be created

 