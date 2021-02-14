package com.sr.Testscripts;

import org.testng.annotations.Test;

import com.sr.genericlib.BaseClass;
import com.sr.genericlib.Utilies;
import com.sr.pompages.Addtocart;
import com.sr.pompages.Login;

public class Addingtocart extends BaseClass {

	@Test
	public void tc1()
	{
		Login l=new Login(driver);

		ut.mouseAction(driver,l.getCoursetab());
		
		l.seleniumtrainingbtn();
		
		Addtocart a=new Addtocart(driver);
		ut.doubleClick(driver,a.getAddbtn() );
		
		a.addtocartbtn();
		
		ut.alertpopup(driver);
		
		a.cartbtn();
		
		a.gotocartbtn();
	}
}
