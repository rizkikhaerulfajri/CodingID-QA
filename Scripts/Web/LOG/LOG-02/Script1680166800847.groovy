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

WebUI.click(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Masuk untuk dapatkan akses di Coding.ID/button_Sign-in With Google'))

WebUI.setText(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/input_demo-app.online_identifier'), 
    'rizkikhaerulfajri@gmail.com')

WebUI.click(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/span_Berikutnya'))

WebUI.click(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/span_Coba lagi'))

WebUI.setText(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/input_demo-app.online_identifier'), 
    'rizkikhaerulfajri@gmail.com')

WebUI.click(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/div_Browser atau aplikasi ini mungkin tidak aman'))

WebUI.click(findTestObject('Object Repository/WEB/Login/LOG-02/Page_Login - Akun Google/div_Coba gunakan browser lain. Jika Anda su_22138e'))

WebUI.closeBrowser()

