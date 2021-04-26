import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType


//setup randomizer array
Integer[] arr = new Integer[100];

for (int i = 0; i < arr.length; i++) {
	arr[i] = i;
}

Collections.shuffle(Arrays.asList(arr));
//end randomizer

WebUI.openBrowser('')

'Set viewport size width,height'
WebUI.setViewPortSize(1520, 1024)

//navigate to game
WebUI.navigateToUrl('https://pjmisfit.github.io/the-checkbox-game/')

//click the start button
WebUI.click(findTestObject('Page_The Checkbox Game/input_StartGame'))

//switch to the selenium driver to use the selenium elements and java actions
WebDriver driver = DriverFactory.getWebDriver()
JavascriptExecutor executor = (JavascriptExecutor) driver;

//find 100 checkboxes elements
//look for input elements that contain the target text
String xpath = '//input[contains(@id,"checkid")]'
WebElement[] elements = driver.findElements(By.xpath(xpath))

//did we get 100?
println(elements.size())
assert elements.size() == 100

// click each one
for ( int i = 0; i < 100; i++) {
	//println(i)
	//click random element
	executor.executeScript('arguments[0].click()',elements[arr[i]])
	WebUI.delay(0.1)
}

//how do we win?