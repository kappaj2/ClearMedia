package za.co.clearline;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProps {
	private static Properties prop =   new Properties();

	public static void main(String[] args) {
		try {

			File propFiles = new File("//home//clearline//clearline.properties");
			boolean canRead = propFiles.canRead();
			
			System.out.println("Can read prop file is " + canRead);
			prop.load(new FileInputStream(propFiles));

			System.out.println("Value for media_type is "+prop.getProperty("media_type"));
			
		} catch (IOException fne) {
			fne.printStackTrace();
		}
	}

}
