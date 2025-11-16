Feature: Checks is the login function Headerexample
Scenario Outline: Enter is into the new browser Headerexample
Given Datatable is open the browser Headerexample
When Datatable is Enter the user credentials"<username>" and "<Password>" Headerexample
And Datatable is verify into the browser launched Headerexample
Then Datatable is Verify the loginpage Headerexample.

Examples:
|username | Password|
|Vignesh | Test|
|Test | Vignesh|
