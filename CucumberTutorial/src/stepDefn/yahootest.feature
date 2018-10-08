Feature: Gmail Application Testing

@First
Scenario Outline: Gmail Login Test

Given user opens gmail page
Then user enters email id "<username>"
Then user clicks next 
And user enters password "<password>"
And user clicks next button
And user closes the browser

Examples:
| username | password |
| bhavani | mahathi |
| krishna | kurra |
| mahathi | kurra |
| mahathi | bhavani |

@Second
Scenario: Get Gmail title

Given user opens gmail 
Then get the title of gmail page
And close the browser

