# Checkboxes
A Katalon script to check some boxes in a web game

A co-worker discovered a game to check 100 boxes.  
Game :https://pjmisfit.github.io/the-checkbox-game/
repo: https://github.com/Pjmisfit/the-checkbox-game
They mentioned that it would be a good exercise to see if we could create a Katalon script for playing the game.
Turns out it was a bit more challenging since the recording the Katalon made would not play back and click the boxes.
We had to add a selenium driver feature and javascript actions to click the boxes.

Selenium driver in Katalon
https://docs.katalon.com/katalon-studio/docs/using_selenium_webdriver_katalon_studio.html
We used WebDriver driver = DriverFactory.getWebDriver() to just use the working driver

JavascriptExecutor - used to call the click action
https://forum.katalon.com/t/unable-to-click-on-object-other-element-would-receive-click/6063/6
We basically used JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript('arguments[0].click()',element)

Other discoveries were that it was much faster to get all the matching elements in an array and loop through that array to click.

We got fancy and created a shuffled array to randomly click the boxes.
https://www.geeksforgeeks.org/collections-shuffle-java-examples/
