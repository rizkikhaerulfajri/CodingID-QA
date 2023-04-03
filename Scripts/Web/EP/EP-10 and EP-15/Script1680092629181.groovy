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

WebUI.setText(findTestObject('Object Repository/WEB/Page_Masuk untuk dapatkan akses di Coding.ID/Login_Field_Email'), 'pooyutre203@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/WEB/Page_Masuk untuk dapatkan akses di Coding.ID/Login_Field_KataSandi'), 
    'gR0Nb1R4MGJzAGnAbnpVZA==')

WebUI.click(findTestObject('Object Repository/WEB/Page_Masuk untuk dapatkan akses di Coding.ID/Login_Button_Login'))

WebUI.navigateToUrl('https://demo-app.online/event')

WebUI.click(findTestObject('Object Repository/WEB/Page_Online event bersertifikat dari prakti/Event_Item_Day 3 Predict using Machine Learning_OpenEvent'))

WebUI.click(findTestObject('Object Repository/WEB/Page_Day 3 Predict using Machine Learning - Ziyad/DetEvent_Button_Beli'))

WebUI.verifyElementText(findTestObject('Object Repository/WEB/Page_Day 3 Predict using Machine Learning - Ziyad/DetEvent_ModalSuccess_Text_Add to cart success'), 
    'add to cart success')

WebUI.click(findTestObject('Object Repository/WEB/Page_Day 3 Predict using Machine Learning - Ziyad/DetEvent_ModalSuccess_Text_Tutup'))

WebUI.closeBrowser()

