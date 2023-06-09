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

def testData = TestDataFactory.findTestData("Data Files/Web/ChangeProfile_PhoneCountryCode")

for (def i = 1; i <= testData.getRowNumbers(); i++) {
	String uploadFilePath = "/Include/Resources/"
	String uploadFileName = "cat01.jpeg"
	File file = new File(RunConfiguration.getProjectDir(), uploadFilePath + uploadFileName)
	def inputImage = file.toString()
	def inputName = "Edited Name"
	def inputPhone = testData.getValue("Phone", i).toString().trim()
	def inputBirthday = '01-Jan-2000'
	
	//Needed for edit success notification
	def originalNameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name')).trim()
	
	WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))
	
	//Set Text
	WebUI.uploadFile(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), inputImage)
	WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), inputName)
	WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), inputPhone)
	WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), inputBirthday)
	
	def nameInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'value')
	WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))
	WebUI.delay(2)
	
	//Get profile attributes as variable
	def profileImage = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')
	def decodedProfileImage = URLDecoder.decode(profileImage, 'UTF-8')
	def nameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))
	def phoneProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))
	def birthdayProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))
	
	//Edit success notification
	WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), originalNameProfile + ' telah di edit')
	WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))
	
	assert decodedProfileImage.endsWith(uploadFileName) : 'Updated photo does not match the uploaded one'
	assert nameProfile == inputName : 'Updated Name does not match the inputted one'
	assert phoneProfile == inputPhone : 'Updated Phone Number does not match the inputted one'
	assert birthdayProfile == inputBirthday : 'Updated Birthday does not match the inputted one'
}

