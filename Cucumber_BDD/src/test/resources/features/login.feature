Feature: check user is able to login with valid credetials
Scenario Outline: successful login
Given login page should be open in default browser
When click on login button and enter <username1> and add <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|3758855|password|fail|
|username|shjdbmsj|fail|
|ejdidbd|hdksudnn|fail|
|username|password|pass|