package javafinal;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DataManager {
	
	private static final String Filepath = "data.txt";
	
	public static boolean AddLicence(String firstName, String lastName, String gender,String age)
	{
		try(PrintWriter pr = new PrintWriter(new FileWriter(new File(Filepath), true)))
		{
			pr.printf("%s,%s,%s,%s%s", firstName, lastName,gender, age,System.getProperty("line.separator"));
			return true ;
		} catch (Exception e) {
			return false ;
		}
		
	}

}
