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

WebUI.navigateToUrl('https://demo-app.online/login')

WebUI.setText(findTestObject('Object Repository/WEB/Login/Login_inputText_Email'), 'burnerforpractice02@gmail.com')

WebUI.setText(findTestObject('WEB/Login/Login_inputText_Password'), 'testingtesting')

WebUI.click(findTestObject('WEB/Login/Login_button_Login'))

WebUI.delay(2)

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')

//Original values in the profile
def imgOriginal = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
def nameOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))
def phoneOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))
def birthdayOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))

WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), nameOriginal + ' telah di edit')

WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))

def imgOriginalAfter = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
def nameOriginalAfter = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))
def phoneOriginalAfter = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))
def birthdayOriginalAfter = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))

assert imgOriginalAfter == imgOriginal
assert nameOriginalAfter == nameOriginal
assert phoneOriginalAfter == phoneOriginal
assert birthdayOriginalAfter == birthdayOriginal

