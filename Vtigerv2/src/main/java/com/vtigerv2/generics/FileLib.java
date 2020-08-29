package com.vtigerv2.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
		
	public String getExceldata(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException, InvalidFormatException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data/TestScriptDataSH.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).toString();
		return data;
	}
	
	public void setExcelData(String Sheetname, int row, int cell, String setValue) throws EncryptedDocumentException, IOException, InvalidFormatException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/TestScriptDataSH.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheetname).getRow(row).getCell(cell).setCellValue(setValue);
		FileOutputStream fos = new FileOutputStream("Testdata.xlsx");
		wb.write(fos);
		wb.close();
	}

}
