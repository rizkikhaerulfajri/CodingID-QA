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
	import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
	import com.kms.katalon.core.exception.StepFailedException as StepFailedException
	import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
	import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
	import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
	import java.io.File as File
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://demo-app.online/dashboard/profile')
	
	//Needed for edit success notification
	def originalNameProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name')).trim()
	
	WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))
	
	
	WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_Calendar'))
	def month = WebUI.getText(findTestObject('WEB/Change Profile/ChangeProfile_Calendar_monthYearDupe'))
	
	//To reduce looping time, set the year to 1924
	WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), '01-Jan-1924')
	
	while(WebUI.verifyElementPresent(findTestObject('WEB/Change Profile/ChangeProfile_Calendar_prevButton'), 0, FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_Calendar_prevButton'))
	}
	WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_Calendar_SelectedDateLastRow'))
	
	def nameInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'value')
	def birthdayInputValue = WebUI.getAttribute(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), 'value')
	WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))
	WebUI.delay(2)
	
	//Get profile attributes as variable
	def birthdayProfile = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))
	
	//Edit success notification
	WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), originalNameProfile + ' telah di edit')
	WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))
	
	assert birthdayProfile == birthdayInputValue : 'Updated Birthday does not match the inputted one'