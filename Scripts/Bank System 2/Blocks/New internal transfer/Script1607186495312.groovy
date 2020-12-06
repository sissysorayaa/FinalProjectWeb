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

WebUI.check(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/Page_Home Page - BankSystem/a_Money transfers'))

WebUI.click(findTestObject('Bank System 2/Internal transfer/Page_Home Page - BankSystem/a_New Transfer'))

WebUI.click(findTestObject('Bank System 2/Internal transfer/Page_Payment types - BankSystem/a_Create new payment'))

WebUI.selectOptionByValue(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/select_Select source account...            _416b1c'), 
    'adb90ce0-a986-4d11-846f-636307c7df05', true)

WebUI.selectOptionByValue(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/select_...or choose another one of your acc_9cdac5'), 
    'CBAE42079313', true)

WebUI.doubleClick(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/main_Create internal money transfer        _189116'))

WebUI.setText(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/input__Amount'), 
    '50')

WebUI.click(findTestObject('Bank System 2/Internal transfer/Page_Create internal money transfer - BankSystem/button_Pay'))

WebUI.closeBrowser()

