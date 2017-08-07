package DevOpsTest.ram.ad;

import java.io.File;

public class RWIntoFileUsingFileR_W extends FileRead_FileWrite {

	public static final String PATH_NAME = "C://FileIO//myTestFileUsingFileR_W.txt";

	public static void main(String[] args) {

		File f = new File(PATH_NAME);

		/*
		 * Create file if not exist.
		 */
		if (!f.exists()) {

			boolean isFileCreated = CreateFile(f);

			if (isFileCreated) {
				System.out.println("File created successsfully");
			} else {
				System.out.println("Failed to create file");
			}

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
