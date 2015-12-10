package com.framework.DataDriven.suitA;

import org.testng.annotations.Test;

import com.framework.DataDriven.util.Utility;
import com.framework.DataDriven.util.Xls_Reader;

public class TestCase1 {



	@Test
	public void Test1(){

		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\Suite.xlsx");
		Utility.isSuiteRunnable("SuiteA", xls);
		
		
		
	}



}
