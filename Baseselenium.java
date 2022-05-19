package org.base;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseselenium {
     static WebDriver driver;
	public static void chrome() {
	WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
	}
	public static void launchurl(String url) {
	driver.get(url);
	}
	public static void maximize() {
	driver.manage().window().maximize();
	}
	public String gettitle() {
	String title	=driver.getTitle();
	return title;
	}
	public String currenturl() {
	String currenturl=	driver.getCurrentUrl();
	return currenturl;
	}
	public static void closeallbrowser() {
	driver.quit();
	}
	public void closecurrentbrowser() {
	driver.close();
	}
	public WebElement findid(String id) {
	WebElement element=driver.findElement(By.id(id));
	return element;
	}
	public WebElement findname(String name) {
	WebElement element=	driver.findElement(By.name(name));
	return element;
	}
	public WebElement findclass(String name) {
		WebElement element=	driver.findElement(By.className(name));
		return element;
	}
	public WebElement findxpath(String attributevalue) {
		WebElement element=	driver.findElement(By.xpath(attributevalue));
		return element;
	}
	public void insertvalue(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	
	public String getext(WebElement element) {
	String text1=element.getText();
	return text1;
	}
	public String getattribute(WebElement element,String name) {
		String attribute=element.getAttribute(name);
		return attribute;
	}
	public String getattribute(WebElement element) {
		String attribute=element.getAttribute("value");
		return attribute;
	}
	public void navigate(String url) {
	driver.navigate().to(url);
	}
	public void navigateback() {
		driver.navigate().back();

	}
	public void navigteforward() {
		driver.navigate().forward();

	}
	public void navigterefresh() {
		driver.navigate().refresh();

	}
	public void navigateurl(String arg,URL url) throws MalformedURLException {
	URL urll= new URL(arg);
	driver.navigate().to(urll);

	}
	public void staticsleep(long millis) throws InterruptedException {
	Thread.sleep(millis);

	}
	public void actionssendkeys(String keys) {
	Actions actions= new Actions(driver);
	 actions.sendKeys(keys);

	}
	public void actionskeyboardfunctions(WebElement target,String keys) {
		Actions actions= new Actions(driver);
	actions.sendKeys(target, keys);
	}
	public void actionsdraganddrop(Actions actions,WebElement source,WebElement target) {
	actions.dragAndDrop(source, target).perform();

	}
	public void actionsmouseover(Actions actions,WebElement target) {
		actions.moveToElement(target).perform();

	}
	public void actionsrightclick(Actions actions,WebElement element) {
		actions.contextClick(element).perform();
	

	}
	public void actionsdoubleclick(Actions actions,WebElement element) {
		actions.doubleClick(element).perform();

	}
	public void robot(int keycode) throws AWTException {
	Robot robot= new Robot();
	robot.keyPress(keycode);
	robot.keyRelease(keycode);
	}
	public void actionssinglekeyboard(Actions actions,CharSequence key) {
	actions.keyDown(key);
	actions.keyUp(key);

	}
	public Alert alertaccept() {
	Alert alert=driver.switchTo().alert();
	alert.accept();
	return alert;
	}
	public void alertdismiss(Alert alert) {
	alert.dismiss();

	}
	public String alerttext(Alert alert) {
	String text=alert.getText();
	return text;

	}
	public void alertinsertvalue(Alert alert,String data) {
	alert.sendKeys(data);

	}
	public void jsinsertvalue(WebElement element,String text) {
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','"+text+"')",element);

	}
	public void jsgetvalue(WebElement element) {
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("return arguments[0].getAttribute('value')",element);

	}
	public void jsclick(WebElement element,JavascriptExecutor executor) {
		executor.executeScript("arguments[0].click()",element);

	}
	public void jsscrolldown(WebElement element,JavascriptExecutor executor) {
		executor.executeScript("arguments[0].scrollIntoView(true)",element);

	}
	public void jsscrollup(WebElement element,JavascriptExecutor executor) {
		executor.executeScript("arguments[0].scrollIntoView(false)",element);

	}
	public Select dropdownbyindex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		return select;
	}
	public Select dropdownbyvalue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		return select;
	}
	public Select dropdownbytext(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		return select;
	}
	public java.util.List<WebElement> dropdowngetoptions(WebElement element,String text) {
		Select select = new Select(element);
	java.util.List<WebElement> options=	select.getOptions();
	return options;
	}
	public WebElement dropdownget(java.util.List<WebElement> options,int index) {     
	WebElement element=	options.get(index);
	return element;
		}
	public String dropdowngettext(WebElement element) {
	String text=	element.getText();
	return text;

	}
	public String dropdowngetattribute(WebElement element,String name) {
		String attribute=	element.getAttribute(name);
		return attribute;
		}
	public void dropdowndeselectbyindex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void dropdowndeselectbytext(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void dropdowndeselectbyvalue(WebElement element,String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void dropdowndeselectall(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public java.util.List<WebElement>  dropdowngetallselectedoptions(WebElement element) { 
		Select select = new Select(element);
	java.util.List<WebElement> alloptions=	select.getAllSelectedOptions();
	return alloptions;
		}
	public WebElement dropdowngetfristselectedoptions(WebElement element) {   
		Select select = new Select(element);
	WebElement element1=	select.getFirstSelectedOption();
		return element1;
		}
	public void frame(int index) {
	driver.switchTo().frame(index);
	}
	public void frame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void frame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void frameout() {
	driver.switchTo().defaultContent();

	}
	public void parentframe() {
		driver.switchTo().parentFrame();
	}
	public void switchtowindow(String name) {
		driver.switchTo().window(name);

	}
	public String parentwindowid() {
	String parentwindowid=	driver.getWindowHandle();
	return parentwindowid;

	}
	public Set<String> allwindowid() {
		Set<String> allwindowid=	driver.getWindowHandles();
		return allwindowid;

	}
	public void childwindowid(Set<String> allwindowid,String parentwindowid) {
	for (String childwindowid : allwindowid) {
	if (!parentwindowid.equals(childwindowid)) {
		driver.switchTo().window(childwindowid);
	}	
	}
	}
	public void fullscreenshot(File file,String path) throws IOException {
	TakesScreenshot screen =(TakesScreenshot)driver;
	File s=screen.getScreenshotAs(OutputType.FILE);
	File d= new File(path);
	FileUtils.copyFile(s, d);
	}
	public void halfscreenshot(WebElement element,File file,String path) throws IOException {
		File s=element.getScreenshotAs(OutputType.FILE);
		File d= new File(path);
		FileUtils.copyFile(s, d);
	}
	
	public String xcelcondition(String sheetname,int rownum,int cellnum) throws IOException {
		String res=null;
		File file = new File("C:\\Users\\VJSANKAR\\eclipse-workspace\\Newmaven\\Xcel\\adactt.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		org.apache.poi.ss.usermodel.CellType type=cell.getCellType();
	switch (type) {
	case STRING:
		res=cell.getStringCellValue();
		return res;
	case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
		Date datecellvalue=cell.getDateCellValue();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
		res =dateformat.format(datecellvalue);
		return res ;
			
		} else {
			double numericcellvalue=cell.getNumericCellValue();
			BigDecimal b=BigDecimal.valueOf(numericcellvalue);
			res=b.toString();
			return res;
		}
	default:
		break;
	}
	return res ;
	}
	public void xcelvaluechange(String sheetname,int rownum,int cellnum, String olddata,String newdata) throws IOException {
		File file = new File("C:\\\\Users\\\\VJSANKAR\\\\eclipse-workspace\\\\Newmaven\\\\Xcel");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		String stringcellvalue=cell.getStringCellValue();
		if (stringcellvalue.contains(olddata)) {
		cell.setCellValue(newdata);
		}
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	public void xcelcreatecellvalue(String sheetname,int rownum,int cellnum,String newdata) throws IOException {
		
		File file = new File("C:\\Users\\VJSANKAR\\eclipse-workspace\\Newmaven\\Xcel\\adactt.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.createCell(cellnum);
		cell.setCellValue(newdata);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	public void xcelcreatecellrowvalue(String sheetname,int rownum,int cellnum,String newdata) throws IOException {
		File file = new File("C:\\Users\\VJSANKAR\\eclipse-workspace\\Newmaven\\Xcel\\adactt.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.createRow(rownum);
		Cell cell=row.createCell(cellnum);
		cell.setCellValue(newdata);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	public void xcelnewsheet(String sheetname,int rownum,int cellnum,String newdata) throws IOException {
	
		File file = new File("C:\\Users\\VJSANKAR\\eclipse-workspace\\Newmaven\\Xcel\\adactt.xlsx");
		Workbook workbook= new XSSFWorkbook();
		Sheet sheet=workbook.createSheet(sheetname);
		Row row=sheet.createRow(rownum);
		Cell cell=row.createCell(cellnum);
		cell.setCellValue(newdata);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
}
