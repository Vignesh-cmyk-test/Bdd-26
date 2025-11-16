Feature: Checks is the login function Header
Scenario: Enter is into the new browser Header
Given Datatable is open the browser Header
When Datatable is Enter the user credentials Header
|Username | Password|
|Vignesh | Test|
And Datatable is verify into the browser launched Header
Then Datatable is Verify the loginpage Header.
