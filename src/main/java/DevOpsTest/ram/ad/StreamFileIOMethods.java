package DevOpsTest.ram.ad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class StreamFileIOMethods {

	/*
	 * Method to create file
	 */

	protected static boolean createFile(File f) {
		boolean isFileCreateSuccess = false;

		try {
			isFileCreateSuccess = f.createNewFile();

		} catch (IOException e) {
			System.out.println("Failed to create file");
		}
		return isFileCreateSuccess;

	}

	/*
	 * Method to write into file
	 */

	protected static void writeIntoFile(File f, String str) {

		try {
			FileOutputStream fos = new FileOutputStream(f);

			fos.write(str.getBytes());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * Read from file
	 */
	protected static void readFromFile(File f){
		
		
		FileInputStream fis = null;
		
		try {
			 fis = new FileInputStream(f);
			
			 int i = 0;
			 
			 while((i = fis.read())!= -1){
			
			System.out.print((char)i);
			 }
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
