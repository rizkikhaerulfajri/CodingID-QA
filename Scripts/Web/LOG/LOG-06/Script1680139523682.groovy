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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.TestDataFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/login')

WebUI.setText(findTestObject('Object Repository/Web/Login/Login_inputText_Email'), '')

WebUI.setText(findTestObject('Object Repository/Web/Login/Login_inputText_Password'), 'testingtesting')

WebUI.click(findTestObject('Object Repository/Web/Login/Login_button_Login'))

WebUI.delay(2)

WebUI.verifyMatch('https://demo-app.online/login', WebUI.getUrl(), false, FailureHandling.CONTINUE_ON_FAILURE)

println('After URL Validation')

def isValid = WebUI.executeJavaScript('document.getElementById("email").reportValidity();', null)
assert !isValid : 'Validation error should be displayed'

