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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_DemoShop/button_Direct payment'))

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Payment Gateway/button_Netherlands                        C_0baa08'))

WebUI.setText(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Log in - BankSystem/input_Email_Input.Email'), 
    'sissysoraya10@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Log in - BankSystem/input_Password_Input.Password'), 
    'bg6+KhxmclQxkdkTBdRWdg==')

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Confirm payment - BankSystem/button_Close'))

WebUI.click(findTestObject('Object Repository/Demo Shop/Buy and pay/Page_Confirm payment - BankSystem/button_Pay 8.00'))

WebUI.closeBrowser()

