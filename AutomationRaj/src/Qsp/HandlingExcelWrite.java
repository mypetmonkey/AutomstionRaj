package Qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelWrite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 wb.getSheet("Sheet2").getRow(1).getCell(3).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./Data/testscript.xlsx");
	  wb.write(fos);
	  wb.close();
		
	}

}
