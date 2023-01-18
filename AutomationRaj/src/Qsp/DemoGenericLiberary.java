package Qsp;

import java.io.IOException;

import com.actitime.generics.FileLibrary;

public class DemoGenericLiberary {
	public static void main(String[] args) throws IOException {
		FileLibrary f=new FileLibrary();
		String un=f.getPropertyData("username");
		System.out.println(un);
		//FileLibrary f=new FileLibrary();
		String cm=f.getExcelFile("createcustomer",1,2);
		System.out.println(cm);
		f.setExcelValue("createcustomer",1,3, "pass");
	}

}
