package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

	/**
	 * this is a generic method to read the data from property file.
	 * @param st
	 * @return String
	 * @throws IOException
	 */
	  public String getPropertyData(String st) throws IOException {
		  FileInputStream fis=new FileInputStream("./Data/commondata.property");
		  Properties p=new Properties();
		  p.load(fis);
		  String data = p.getProperty(st);
		  return data;
	  }
	  /**
	   * this is a generic method to read the data from excel file.
	   * @param st
	   * @param i
	   * @param j
	   * @return
	   * @throws IOException
	   */
	public String getExcelFile(String st,int i,int j) throws IOException {
		  FileInputStream fis=new FileInputStream("./Data/testscripts.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		    String data=wb.getSheet(st).getRow(i).getCell(j).getStringCellValue();		  return data;
		  
	  }
	  /**
	   * this is a generic method to write the data from Excel file.
	   * @param st
	   * @param i
	   * @param j
	   * @param s
	   * @throws EncryptedDocumentException
	   * @throws IOException
	   */
 public void setExcelValue(String st,int i,int j,String s) throws EncryptedDocumentException, IOException {
	 FileInputStream fis=new FileInputStream("./Data/testscripts.xlsx");
	  Workbook wb=WorkbookFactory.create(fis);
	 wb.getSheet(st).getRow(i).getCell(j).setCellValue(s);
	 FileOutputStream fos=new FileOutputStream("./Data/testscripts.xlsx");
	 wb.write(fos);
	 wb.close();
	 
 }
	  
}

	


