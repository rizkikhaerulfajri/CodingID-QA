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
String uploadFileName = "big pic.png"
File file = new File(RunConfiguration.getProjectDir(), uploadFilePath + uploadFileName)
def absolutePath = file.toString()	
def nameValue = 'Edited Value'.trim()
def phoneValue = '081123456789'
def birthdayValue = '01-Jan-2000'
	
//Needed for edit success notification
def originalNameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name')).trim()

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))
	
//Upload File
WebUI.uploadFile(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), absolutePath)
	
//Get edit profile field values as variable
def nameInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'value')
def phoneInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), 'value')
def birthdayInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), 'value')
	
WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))

WebUI.delay(2)

assert WebUI.getUrl() == 'https://demo-app.online/dashboard/profile' : 'Not redirected to profile after saving change'
	
WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), originalNameProfile + ' telah di edit')
	
WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))

//Get edit profile field values as variable
def uploadedFileValue = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
def decodedUploadedFileValue = URLDecoder.decode(uploadedFileValue, 'UTF-8')

assert decodedUploadedFileValue.endsWith(uploadFileName) : 'Updated photo does not match the uploaded one'
