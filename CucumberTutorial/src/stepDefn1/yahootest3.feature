
@FunctionalTest
Feature: Google Application


@SmokeTest @RegressionTest
Scenario: go to google home page
Given:user enters google url

@RegressionTest
Scenario: enter text to be searched
Given:user enters search text

@SmokeTest
Scenario: click search button
Given:user enters search button

@SmokeTest @RegressionTest
Scenario: results page is opened
Given:user sees the result page

@RegressionTest
Scenario: select relevant answer link
Given:user then clicks on the answer links he wants to

@SmokeTest @RegressionTest
Scenario:select images link
Given: user then clicks on the image link

@SmokeTest
Scenario: images window opens
Given:images window is opened

@RegressionTest
Scenario: select the needed image 
Given:user then clicks on the image that he wants

@SmokeTest @RegressionTest
Scenario: results window from image clicking is opened
Given:user goes to the window opened from clicking image

@End2End
Scenario: click on the link to know more about that image
Given:user clicks on the image window link to know more about that image

@SmokeTest @End2End
Scenario: read everything related the image
Given:user reads everything about the image 

@End2End
Scenario: when done go back to image list window and select an other image or go back to text search result page
Given:user clicks on an other image or goes to the text search results window


Scenario: select an other link or close the browser
Given:user then clicks on an other link or closes the browser