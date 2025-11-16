Feature: Loginin to the DemoQA 
Scenario: Logg into DemoQA website
Given Open the browser 
When Enter the credentials "Vigensh" "Test#78"
And click the login button
Then check the dashboard page