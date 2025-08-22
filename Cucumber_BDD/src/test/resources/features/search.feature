Feature:check serach feature
Scenario Outline:check search button is working or not
Given click on signin button
When enter inputs and then use keyboard enter key <search1>
Then list of output related to input 
Examples:
|search1|
|online banking|
|transfer funds|
|checking account activity|
