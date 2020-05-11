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

Mobile.startApplication('D:\\PROJECTProgmob-master\\app\\build\\outputs\\apk\\debug\\app-debug.apk', true)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.TextView0 - SI-KRS'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.EditText0 - Email'), 0)

Mobile.setText(findTestObject('Input Matakuliah/android.widget.EditText0 - Email (1)'), '123@staff.ukdw.ac.id', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Input Matakuliah/android.widget.EditText0 - Password'), 0)

Mobile.setText(findTestObject('Input Matakuliah/android.widget.EditText0 - Password (1)'), '123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Input Matakuliah/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Input Matakuliah/androidx.appcompat.widget.LinearLayoutCompat0'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.TextView0 - Create'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.EditText0 - Alpro-1'), 0)

Mobile.setText(findTestObject('Input Matakuliah/android.widget.EditText0 - Alpro-1 (1)'), 'matsi-1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Input Matakuliah/android.widget.EditText0 - Alpro'), 0)

Mobile.setText(findTestObject('Input Matakuliah/android.widget.EditText0 - Alpro (1)'), 'math', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Input Matakuliah/android.widget.EditText0 - 3'), 0)

Mobile.setText(findTestObject('Input Matakuliah/android.widget.EditText0 - 3 (1)'), '3', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Input Matakuliah/android.widget.Spinner0'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.TextView0 - Kamis'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.Spinner0 (1)'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.TextView0 - Sesi2'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.Button0 - SIMPAN'), 0)

Mobile.tap(findTestObject('Input Matakuliah/android.widget.Button0 - YES'), 0)

if (true) {
    WebUI.comment('Berhasil Insert')
} else {
    WebUI.comment('Gagal Insert')
}

Mobile.closeApplication()

