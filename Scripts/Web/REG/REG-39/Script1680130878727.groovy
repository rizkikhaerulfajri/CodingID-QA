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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.exception.StepFailedException

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo-app.online/daftar')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_Nama'), 'Rizki Khaerul Fajri')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_BirthDay'), '18-Feb-1997')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_Email'), 'Test@Example.com')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_Whatsapp'), '081324387267')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_KataSandi'), '')

WebUI.setText(findTestObject('Object Repository/Web/Register/Reg_InputText_KonfirmasiKataSandi'), '')

WebUI.check(findTestObject('Object Repository/Web/Register/Reg_Checkbox_SyaratDanKetentuan'))

WebUI.click(findTestObject('Object Repository/Web/Register/Reg_Button_Daftar'))

WebUI.delay(1)

WebUI.verifyMatch('https://demo-app.online/daftar', WebUI.getUrl(), false, FailureHandling.CONTINUE_ON_FAILURE)

println('After URL Validation')

// Call the reportValidity() function on the input element and capture the return value
def isValid = WebUI.executeJavaScript('document.getElementById("password").reportValidity();', null)

// Check that the return value is false using an assertion
assert !isValid : 'No validation error for password field'



