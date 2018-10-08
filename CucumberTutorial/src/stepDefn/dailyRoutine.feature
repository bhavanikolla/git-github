
Feature: Attitude matters
In order to understand attitude
As a IT professional
I want to know whom to wish 


@tester
Scenario Outline: I am an employee and his attitude

Given I work in latenights
When I meet watchman
Then I greeted him


Given I work in mornings
When I meet newspaperboy
Then I skipgreeting him

Given we work in "<weekdays>"
When I meet "<guy>"
Then I SkippedGreeting him

Examples:
| weekdays | guy       |
| tenpm    | watchman  |
| ninepm   | cabdriver |


