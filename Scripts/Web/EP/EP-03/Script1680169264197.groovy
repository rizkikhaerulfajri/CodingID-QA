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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/event')

WebUI.setText(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    'Denny')

WebUI.sendKeys(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/h3_No available event  Denny'))

WebUI.click(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/div_Events'))

WebUI.setText(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    'Ziyad')

WebUI.sendKeys(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/h3_No available event  Ziyad'))

WebUI.click(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/div_Events'))

WebUI.setText(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    'Eric Julianto')

WebUI.sendKeys(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Event Purchase/EP-03/Page_Online event bersertifikat dari prakti_f42b96/input_Events_searchInputEvent'), 
    '')

WebUI.closeBrowser()
