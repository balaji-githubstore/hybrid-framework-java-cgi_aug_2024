package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] invalidLoginData() {
		String[][] data = new String[2][3];

		data[0][0] = "john";
		data[0][1] = "john123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "bala";
		data[1][1] = "bala123";
		data[1][2] = "Invalid credentials";

		return data;
	}
	
	@DataProvider
	public String[][] commonDataProvider(Method mtd) throws IOException
	{
		
		//mtd.getName(); --> gives current @Test method name
		//test method name is the sheetname
		
		String sheetname=mtd.getName();
		String[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/test-data/hr_test_data.xlsx", 
				sheetname);
		return data;
	}
}
