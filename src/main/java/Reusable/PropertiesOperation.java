package Reusable;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesOperation {

	
	static Properties prop = new Properties();

	public static String getPropertiesValueByKey(String Key) throws Exception {



		//load a data frm properties file

		String propFilePath = System.getProperty("user.dir")+ "/src/test/resource/Config.properties";

		FileInputStream fis = new FileInputStream(propFilePath);
		prop.load(fis);

		//read the data
		String value = prop.get(Key).toString();
		return value ;

	}

}
