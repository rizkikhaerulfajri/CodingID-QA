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
import java.net.URLDecoder

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/login')
WebUI.setText(findTestObject('Object Repository/WEB/Login/Login_inputText_Email'), 'burnerforpractice02@gmail.com')
WebUI.setText(findTestObject('WEB/Login/Login_inputText_Password'), 'testingtesting')
WebUI.click(findTestObject('WEB/Login/Login_button_Login'))
WebUI.delay(2)

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')

def uploadFilePath = 'D:\\Pas Photo.png'
def nameValue = 'Edited Value'
def phoneValue = '081123456789'
def birthdayValue = '01-Jan-2000'

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))

//Set Text
WebUI.uploadFile(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), uploadFilePath)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), nameValue)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), phoneValue)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), birthdayValue)

//Get them as variable
def uploadedFileValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), 'value')
def decodedUploadedFileValue = URLDecoder.decode(uploadedFileValue, 'UTF-8')
def nameInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'value')
def phoneInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), 'value')
def birthdayInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), 'value')

WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), nameInputValue + ' telah di edit')

WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))

assert decodedUploadedFileValue.endsWith('Pas Photo.png')
assert nameInputValue == nameValue
assert phoneInputValue == phoneValue
assert birthdayInputValue == birthdayValue

