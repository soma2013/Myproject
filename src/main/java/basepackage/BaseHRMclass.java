package basepackage;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseHRMclass {
	//browser info
	//url info
	//user name and password

	Properties prop=new Properties();
	WebDriver driver;
	
	//Step 1 
	public BaseHRMclass() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\BISWAJIT SARKAR\\eclipse-workspace\\file\\src\\test\\java\\envirnmentvariables\\Config.propertise");
	
		prop.load(file);
		

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
	    catch (IOException a) {
	    	a.printStackTrace();
	    }
	}
		//Step2
		
		public static void initiation() {
			
		}
	    



}

	
	


