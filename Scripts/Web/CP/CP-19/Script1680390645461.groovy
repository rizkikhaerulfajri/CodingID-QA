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
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.configuration.RunConfiguration
import java.io.File

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/login')
WebUI.setText(findTestObject('Object Repository/WEB/Login/Login_inputText_Email'), 'burnerforpractice02@gmail.com')
WebUI.setText(findTestObject('WEB/Login/Login_inputText_Password'), 'testingtesting')
WebUI.click(findTestObject('WEB/Login/Login_button_Login'))
WebUI.delay(2)

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')

def inputPhone = '081324387'

//Needed for edit success notification
def originalNameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name')).trim()

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))

//Set Text
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), inputPhone)

def nameInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'value')
WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))
WebUI.delay(2)

//Assert that the page stays in the edit page and validation error appeared
assert WebUI.getUrl() == 'https://demo-app.online/dashboard/profile/edit'
assert WebUI.verifyElementPresent(findTestObject('WEB/Change Profile/ChangeProfile_validationError_Name'), 1) : 'Validation error does not appear'


