import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pjmisfit.github.io/the-checkbox-game/')

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/input_How many boxes can you check in 60 se_f02ba2'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/div_How many boxes can you check in 60 seco_4dad50'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label_1'))

WebUI.click(findTestObject('Object Repository/recording/Page_The Checkbox Game/label_1'))

