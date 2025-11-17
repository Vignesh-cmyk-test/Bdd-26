@simplelogin
Feature: Login to DemoQA 
@positive
Scenario: Logging into DemoQA website
Given Launch the browser 
When Enter the username and password
And click the submit button
Then Verify the dashboard page

@negative
Scenario: Logging into DemoQA website negative
Given Launch the browser negative
When Enter the username and password negative
And click the submit button negative
Then Verify the dashboard page negative