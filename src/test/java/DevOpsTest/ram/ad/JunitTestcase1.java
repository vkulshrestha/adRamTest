package DevOpsTest.ram.ad;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class JunitTestcase1 extends FileRead_FileWrite {
	public static final String PATH_NAME = "C://FileIO//myTestFileUsingFileR_W.txt";


	@Test
	public void test() {
		
		File f = new File(PATH_NAME);

		/*
		 * Create file if not exist.
		 */
		if (!f.exists()) {

			boolean isFileCreated = CreateFile(f);

			
			assertTrue("Failed to create file", isFileCreated);
			
			

		}else{
			System.out.println("file is already exist...");
			
			/*
			 * Write into file
			 */
			
			String str = "This is using File writer and FileReader libraries";
			
			writeIntoFile(f,str);
			
			readFromFile(f);
			
		}
	}
		
	

}
