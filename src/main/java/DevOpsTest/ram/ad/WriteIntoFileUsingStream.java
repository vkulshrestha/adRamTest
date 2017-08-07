package DevOpsTest.ram.ad;

import java.io.File;

/**
 * This is the main method , w will perform
 * 1. create file
 * 2. write into file using IO stream
 * 3. ready file using IO stream
 * 
 * @author Lenovo
 *
 */


public class WriteIntoFileUsingStream extends StreamFileIOMethods {

	public static final String PATH_NAME = "C://FileIO//myTestFile.txt";

	public static void main(String[] args) {

		File f = new File(PATH_NAME);

		/*
		 * check if file exist if not exist then create file
		 */
		if (f.exists()) {

			System.out.println("File is already exist");
			
//			System.out.println("is executable :"+f.canExecute());
//			
//			System.out.println("is file have read access :"+ f.canRead());
//			
//			System.out.println("is file have read access :"+ f.canWrite());
			
			/*
			 * write into file
			 */
			
			if(f.canWrite()){
				
				String str = "Ahis is for demo perpose";
				/*
				 * write into file
				 */
				writeIntoFile(f,str);
				
			}
			
			/*
			 * read file
			 */
			
			if(f.canRead()){
				readFromFile(f);
				
			}
			
			
			

		} else {

			boolean createFile = createFile(f);

			if (createFile) {

				System.out.println("New File create....");

			} else {

				System.out.println("Failed to create File ....");
			}
		}

	}

}
