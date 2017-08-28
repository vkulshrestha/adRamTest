package DevOpsTest.ram.ad;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead_FileWrite {

	/*
	 * create file- new method
	 */

	protected static boolean CreateFile(File f) {
		boolean isFileCreated = false;

		try {
			isFileCreated = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isFileCreated;
	}
	
	
	/*
	 * write into a file
	 */
	
	protected static void writeIntoFile(File f, String str){
		FileWriter fw =null;
		
		try {
			 fw = new FileWriter(f);
			// write into file
			 fw.write(str);
			 // Flushes the stream.
			 fw.flush();
			 //close filewriter 
			 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
	 * read into a file
	 */
	
	protected static void readFromFile(File f){
		FileReader fr =null;
		char[] arr =new char[50];
		
		try {
			 fr = new FileReader(f);
			 
			 System.out.println("fr.read returns :" +fr.read(arr));
			 fr.read(arr);

			 // for each type loop12
			 for(char c:arr){
				 System.out.print(c);
			 }
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
