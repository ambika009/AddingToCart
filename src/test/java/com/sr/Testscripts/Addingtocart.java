package com.sr.Testscripts;

import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.genericlib.Utilies;
import com.sr.pompages.Addtocart;
import com.sr.pompages.Login;

public class Addingtocart extends BaseClass {

	@Test
	public void tc1() throws InterruptedException
	{
		Login l=new Login(driver);

		util.mouseAction(driver,l.getCoursetab());
		
		l.seleniumtrainingbtn();
		
		Addtocart a=new Addtocart(driver);
		util.doubleClick(driver,a.getAddbtn() );
		
		a.addtocartbtn();
		
		util.alertpopup(driver);
		
		a.cartbtn();
		
		a.gotocartbtn();
		Thread.sleep(2000);
	}
}
