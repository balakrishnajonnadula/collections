package com.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("abc.txt");
		prop.load(fis);
		System.out.println(prop);
		prop.setProperty("Balakrishna", "Jonnadula");
		String str = prop.getProperty("jbk");
		System.out.println(str);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		prop.store(fos, "Updated by jbk..!");
		
	}

}
