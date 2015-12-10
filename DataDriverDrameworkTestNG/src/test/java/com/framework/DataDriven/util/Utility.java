package com.framework.DataDriven.util;

public class Utility {

	public static boolean isSuiteRunnable(String SuiteName, Xls_Reader xls){
		
		int rows = xls.getRowCount("Suite");
		
		for (int rNum= 2; rNum<xls.getRowCount(SuiteName); rNum++){
			
			String data = xls.getCellData("Suite", "SuiteName", rNum);
			
			
		System.out.println(data);	
		}
		return false;
		
	}

}
