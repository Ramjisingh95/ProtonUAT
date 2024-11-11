package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader fr= new FileReader("C:\\Users\\Ramji.Singh\\eclipse-workspace\\ProtonAutomation\\src\\test\\resources\\configfiles\\config.properties");
		Properties P= new Properties();
		P.load(fr);
		
		System.out.println(P.getProperty("browser"));
		System.out.println(P.getProperty("testurl"));
		
	}

}
