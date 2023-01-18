package Qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("createcustomer").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data);
		
		
	}
} 