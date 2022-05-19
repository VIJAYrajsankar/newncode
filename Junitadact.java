package org.base;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Junitadact extends Baseselenium {
	 
	static WebDriver driver;
	// @ 1 2 3 4 5 6 7 8 9 0
	@BeforeClass
	public static void beforeclass() {
		chrome();
		launchurl("https://adactinhotelapp.com/");
		maximize();
	}
	@AfterClass
	public static void afterclass() {
	closeallbrowser();
	}
	@Test
	public void test() throws IOException, InterruptedException {
		WebElement adact=findxpath("//p[text()='Adactin Launches The Adactin Hotel App! ']");
		String adacttext=adact.getText();
		System.out.println(adacttext);
		boolean a=adacttext.contains("Adactin");
		Assert.assertTrue("verify", a);
	WebElement user=findxpath("//input[@id='username']");
String uservalue=xcelcondition("hotel",1,0);
insertvalue(user, uservalue);
WebElement pass=findxpath("//input[@id='password']");
String passvalue=xcelcondition("hotel",1 ,1);
insertvalue(pass, passvalue);
WebElement login=findxpath("//input[@id='login']");
click(login);

WebElement search=findxpath("//td[text()='Search Hotel ']");
String searchtxt=search.getText();
System.out.println(searchtxt);
boolean b=searchtxt.contains("Search");
Assert.assertTrue("verify", b);
WebElement location=findxpath("//select[@name='location']");
String locationvalue=xcelcondition("hotel",1,2);
insertvalue(location,locationvalue);
WebElement hotelsclk=findxpath("//select[@id='hotels']");
click(hotelsclk);
String hotels=xcelcondition("hotel",1,3);
dropdownbyindex(hotelsclk,3);
WebElement roomtypeclk=findxpath("//select[@id='room_type']");
click(roomtypeclk);
dropdownbyindex(roomtypeclk,3);
WebElement roomsclk=findxpath("//select[@id='room_nos']");
click(roomsclk);
dropdownbyindex(roomsclk, 1);
WebElement adultroomsclk=findxpath("//select[@id='adult_room']");
click(adultroomsclk);
dropdownbyindex(adultroomsclk, 1);
WebElement childroomsclk=findxpath("//select[@id='child_room']");
click(childroomsclk);
dropdownbyindex(childroomsclk, 1);
WebElement searchclick=findxpath("//input[@id='Submit']");
click(searchclick);
WebElement hotel=findxpath("//td[text()='Select Hotel ']");
String hoteltext=hotel.getText();
System.out.println(hoteltext);
boolean c=hoteltext.contains(" ");
Assert.assertTrue("verify", c);
WebElement selecthotelclick=findxpath("//input[@id='radiobutton_0']");
click(selecthotelclick);
WebElement continueclick=findxpath("//input[@id='continue']");
click(continueclick);
WebElement book=findxpath("//td[text()='Book A Hotel ']");
String bookvalue=book.getText();
System.out.println(bookvalue);
boolean d=bookvalue.contains(" ");
Assert.assertTrue("verify",d);
WebElement first=findxpath("//input[@id='first_name']");
String firstvalue=xcelcondition("hotel",1,10);
insertvalue(first,firstvalue);
WebElement last=findxpath("//input[@id='last_name']");
String lastvalue=xcelcondition("hotel",1,11);
insertvalue(last,lastvalue);
WebElement address=findxpath("//textarea[@id='address']");
String addressvalue=xcelcondition("hotel",1,12);
insertvalue(address,addressvalue);
WebElement credit=findxpath("//input[@id='cc_num']");
String creditvalue=xcelcondition("hotel",1,13);
insertvalue(credit,creditvalue);
WebElement credittype=findxpath("//select[@id='cc_type']");
click(credittype);
String credittypevalue= xcelcondition("hotel",1,7);
dropdownbyindex(credittype,3);
WebElement creditmonth=findxpath("//select[@id='cc_exp_month']");
click(creditmonth);
String creditmonthvalue= xcelcondition("hotel",1,8);
dropdownbyindex(creditmonth,10);
WebElement credityear=findxpath("//select[@id='cc_exp_year']");
click(credityear);
dropdownbyindex(credityear,10);
WebElement ccvno=findxpath("//input[@id='cc_cvv']");
String ccvnovalue=xcelcondition("hotel",1,14);
insertvalue(ccvno,ccvnovalue);
WebElement bookclk=findxpath("//input[@id='book_now']");
click(bookclk);
staticsleep(5000);
WebElement booking=findxpath("//td[text()='Booking Confirmation ']");
String bookingvalue=booking.getText();
System.out.println(bookingvalue);
boolean e=bookingvalue.contains(" ");
Assert.assertTrue("verify",e);
WebElement bookno=findxpath("//input[@id='order_no']");
String bookid=getattribute(bookno);
xcelcreatecellvalue("hotel",4,15,bookid);
	}
}
