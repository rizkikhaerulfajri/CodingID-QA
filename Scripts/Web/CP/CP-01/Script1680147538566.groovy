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

def imgOriginal = WebUI.getAttribute(findTestObject('WEB/Profile/Profile_img_profilePhoto'), 'src')

def nameOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Name'))

def phoneOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Phone'))

def birthdayOriginal = WebUI.getText(findTestObject('WEB/Profile/Profile_text_Birthday'))

println(imgOriginal)
println(nameOriginal)
println(phoneOriginal)
println(birthdayOriginal)

WebUI.click(findTestObject('WEB/Profile/Profile_button_EditProfile'))

WebUI.uploadFile(findTestObject('WEB/Change Profile/ChangeProfile_button_uploadButton'), 'D:\\Pas Photo.png')

WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Name'), 'Edited Value')

WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_Phone'), '081123456789')

WebUI.setText(findTestObject('WEB/Change Profile/ChangeProfile_inputText_BirthDay'), '01-Jan-2000')

WebUI.click(findTestObject('WEB/Change Profile/ChangeProfile_button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/WEB/Change Profile/Profile_p_ChangeSuccessNotif'), 'Rizki Khaerul Edited telah di edit')

WebUI.click(findTestObject('Object Repository/WEB/Change Profile/Profile_button_ChangeSuccessNotif'))

WebUI.verifyElementText(findTestObject('WEB/Profile/Profile_text_Name'), 'Rizki Khaerul Edited')

WebUI.verifyElementText(findTestObject('WEB/Profile/Profile_text_Email'), 'burnerforpractice02@gmail.com')

WebUI.verifyElementText(findTestObject('WEB/Profile/Profile_text_Phone'), '081000000000')

WebUI.verifyElementText(findTestObject('WEB/Profile/Profile_text_Birthday'), '31-Dec-1923')

