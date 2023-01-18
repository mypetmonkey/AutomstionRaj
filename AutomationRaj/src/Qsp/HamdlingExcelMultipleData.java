package Qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HamdlingExcelMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rc=wb.getSheet("actitime").getLastRowNum();
		for(int i=0;i<rc;i++) {
			String username=wb.getSheet("actitime").getRow(i).getCell(0).getStringCellValue();
			String password=wb.getSheet("actitime").getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"   "+password);
		 }
	}

}
