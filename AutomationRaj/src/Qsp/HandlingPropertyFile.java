package Qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
    public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String s1 = p.getProperty("url");
		String s2=p.getProperty("username");
		String s3=p.getProperty("password");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
