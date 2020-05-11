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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/tokobuah/index.php/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_Login Admin/input_Email_email'), 'dian')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Admin/input_Password_password'), 'MMS/zmTQxAM=')

WebUI.click(findTestObject('Object Repository/Page_Login Admin/input_Lupa Password_btn btn-success w-100'))

halaman_tujuan = WebUI.getUrl()

if (halaman_tujuan == 'http://localhost/tokobuah/index.php/admin') {
    WebUI.comment('Berhasil Login')
} else {
    WebUI.comment('Gagal Login')
}

Mobile.startApplication('D:\\PROJECTProgmob-master\\app\\build\\outputs\\apk\\debug\\app-debug.apk', true)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.TextView0 - SI-KRS'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.EditText0 - Email'), 0)

Mobile.setText(findTestObject('Insert Matakuliah/android.widget.EditText0 - Email (1)'), '123@staff.ukdw.ac.id', 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.EditText0 - Password'), 0)

Mobile.setText(findTestObject('Insert Matakuliah/android.widget.EditText0 - Password (1)'), 'rahasiswa', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.TextView0 - Create'), 0)

Mobile.setText(findTestObject('Insert Matakuliah/android.widget.EditText0 - Alpro-1'), '01-mathsi', 0)

Mobile.setText(findTestObject('Insert Matakuliah/android.widget.EditText0 - Alpro'), 'math', 0)

Mobile.setText(findTestObject('Insert Matakuliah/android.widget.EditText0 - 3'), '4', 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.Spinner0'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.TextView0 - Rabu'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.TextView0 - Sesi1'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.TextView0 - Sesi3'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.Button0 - SIMPAN'), 0)

Mobile.tap(findTestObject('Insert Matakuliah/android.widget.Button0 - YES'), 0)

Mobile.closeApplication()

WebUI.closeBrowser()

