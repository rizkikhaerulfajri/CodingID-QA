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

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')

String uploadFilePath = "/Include/Resources/"
String uploadFileName = "cat01.jpeg"
File file = new File(RunConfiguration.getProjectDir(), uploadFilePath + uploadFileName)
def inputImage = file.toString()
def inputName = 'Edited Value'.trim()
def inputPhone = '081123456789'
def inputBirthday = '01-Jan-2000'

//Get original profile attributes as variable
def originalProfileImage = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
def originalDecodedProfileImage = URLDecoder.decode(originalProfileImage, 'UTF-8')
def originalNameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))
def originalPhoneProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))
def originalBirthdayProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))

//Set Text
WebUI.uploadFile(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), inputImage)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), inputName)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), inputPhone)
WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), inputBirthday)

WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')
WebUI.delay(2)

//Get profile attributes as variable
def profileImage = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
def decodedProfileImage = URLDecoder.decode(profileImage, 'UTF-8')
def nameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))
def phoneProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))
def birthdayProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))

//Edit success notification
assert WebUI.verifyElementNotPresent(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), 2) : 'Profile was updated, not cancelled'

assert decodedProfileImage == originalDecodedProfileImage : 'Updated photo does not match the uploaded one'
assert nameProfile == originalNameProfile : 'Updated Name does not match the inputted one'
assert phoneProfile == originalPhoneProfile : 'Updated Phone Number does not match the inputted one'
assert birthdayProfile == originalBirthdayProfile : 'Updated Birthday does not match the inputted one'
