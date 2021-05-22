package _14_Session._2_PrintAllFilesFolders;

import java.io.File;
import java.util.Arrays;

public class _1_PrintFileFoldersInSortedOrder {

	public static void main(String[] args) {

		countOfFilesNDirectoy("C:\\Users\\Sarang\\eclipse-workspace\\code-java-topics");

	}

	/**
	 * This method will print the File and Directory names
	 * under given path of main directory with the count of
	 * total available file and directories number
	 * @param pathOfDirectory
	 */
	public static void countOfFilesNDirectoy(String pathOfDirectory)
	{
		//String pathOfDirectory = "C:\\Users\\Sarang\\eclipse-workspace\\code-java-topics";

		File file = new File(pathOfDirectory);

		File fileArrayFromDirectory[] = file.listFiles();

		Arrays.sort(fileArrayFromDirectory);

		int noOfFilesCount = 0;
		int noOfDirectoriesCount = 0;
		int noOfUnknownCount = 0;

		for (File e : fileArrayFromDirectory) 
		{
			if (e.isFile()) 
			{
				System.out.println("File : " + e.getName() + " | Path : " + e.getAbsolutePath());
				noOfFilesCount++;
			}
			else if (e.isDirectory())
			{
				System.out.println("Directory : " + e.getName() + " | Path : " + e.getAbsolutePath());
				noOfDirectoriesCount++;
			}
			else 
			{
				System.out.println("Unknown : " +  e.getName() + " | Path : " + e.getAbsolutePath());
				noOfUnknownCount++;
			}
		}

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Inside Directory : " + pathOfDirectory);
		System.out.println("1. No of Files count is : " + noOfFilesCount);
		System.out.println("2. No of Directories count is : " + noOfDirectoriesCount);
		System.out.println("3. No of Unknown count is : " + noOfUnknownCount);
		System.out.println("--------------------------------------------------------------------------------------");
	}

}
