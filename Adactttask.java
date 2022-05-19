package org.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactttask {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		Baseselenium baseclass= new Baseselenium();
		baseclass.chrome();
		baseclass.launchurl("https://adactinhotelapp.com/");
		WebElement user=baseclass.findxpath("//input[@id='username']");
		String uservalue=baseclass.xcelcondition("hotel",1,0);
		baseclass.insertvalue(user, uservalue);
		WebElement pass=baseclass.findxpath("//input[@id='password']");
		String userpass=baseclass.xcelcondition("hotel",1,1);
		baseclass.insertvalue(pass,userpass);
		WebElement login=baseclass.findxpath("//input[@id='login']");
		baseclass.click(login);
		WebElement locationclk=baseclass.findxpath("//select[@name='location']");
		String location=baseclass.xcelcondition("hotel",1,2);
		baseclass.dropdownbytext(locationclk, location);
		//baseclass.dropdownbyindex(locationclk,1);
		WebElement hotelsclk=baseclass.findxpath("//select[@id='hotels']");
		baseclass.click(hotelsclk);
		//baseclass.dropdownbyindex(hotelsclk, 1);
		String hotels=baseclass.xcelcondition("hotel",1,3);
		baseclass.dropdownbyindex(hotelsclk,3);
		WebElement roomtypeclk=baseclass.findxpath("//select[@id='room_type']");
		baseclass.click(roomtypeclk);
	//	baseclass.dropdownbyindex(roomtypeclk, 1);
	//	String rooms=baseclass.xcelcondition("hotel",1,4);
		baseclass.dropdownbyindex(roomtypeclk,3);
		WebElement roomsclk=baseclass.findxpath("//select[@id='room_nos']");
		baseclass.click(roomsclk);
		baseclass.dropdownbyindex(roomsclk, 1);
		WebElement adultroomsclk=baseclass.findxpath("//select[@id='adult_room']");
		baseclass.click(adultroomsclk);
		baseclass.dropdownbyindex(adultroomsclk, 1);
		WebElement childroomsclk=baseclass.findxpath("//select[@id='child_room']");
		baseclass.click(childroomsclk);
		baseclass.dropdownbyindex(childroomsclk, 1);
		WebElement searchclick=baseclass.findxpath("//input[@id='Submit']");
		baseclass.click(searchclick);
		WebElement selecthotelclick=baseclass.findxpath("//input[@id='radiobutton_0']");
		baseclass.click(selecthotelclick);
		WebElement continueclick=baseclass.findxpath("//input[@id='continue']");
		baseclass.click(continueclick);
		WebElement first=baseclass.findxpath("//input[@id='first_name']");
		String firstvalue=baseclass.xcelcondition("hotel",1,10);
		baseclass.insertvalue(first,firstvalue);
		WebElement last=baseclass.findxpath("//input[@id='last_name']");
		String lastvalue=baseclass.xcelcondition("hotel",1,11);
		baseclass.insertvalue(last,lastvalue);
		WebElement address=baseclass.findxpath("//textarea[@id='address']");
		String addressvalue=baseclass.xcelcondition("hotel",1,12);
		baseclass.insertvalue(address,addressvalue);
		WebElement credit=baseclass.findxpath("//input[@id='cc_num']");
		String creditvalue=baseclass.xcelcondition("hotel",1,13);
		baseclass.insertvalue(credit,creditvalue);
		WebElement credittype=baseclass.findxpath("//select[@id='cc_type']");
		baseclass.click(credittype);
		//baseclass.dropdownbyindex(credittype,1);
		String credittypevalue= baseclass.xcelcondition("hotel",1,7);
		baseclass.dropdownbyindex(credittype,3);
		WebElement creditmonth=baseclass.findxpath("//select[@id='cc_exp_month']");
		baseclass.click(creditmonth);
		String creditmonthvalue= baseclass.xcelcondition("hotel",1,8);
		baseclass.dropdownbyindex(creditmonth,10);
		WebElement credityear=baseclass.findxpath("//select[@id='cc_exp_year']");
		baseclass.click(credityear);
		baseclass.dropdownbyindex(credityear,10);
		WebElement ccvno=baseclass.findxpath("//input[@id='cc_cvv']");
		String ccvnovalue=baseclass.xcelcondition("hotel",1,14);
		baseclass.insertvalue(ccvno,ccvnovalue);
		WebElement bookclk=baseclass.findxpath("//input[@id='book_now']");
		baseclass.click(bookclk);
		baseclass.staticsleep(5000);
		WebElement bookno=baseclass.findxpath("//input[@id='order_no']");
		String bookid=baseclass.getattribute(bookno);
		baseclass.xcelcreatecellvalue("hotel",3,15,bookid);
		
		
	}
}
