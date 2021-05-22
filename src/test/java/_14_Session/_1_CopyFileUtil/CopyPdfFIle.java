package _14_Session._1_CopyFileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPdfFIle {

	public static void main(String[] args) {

		copyFile(System.getProperty("user.dir") + "\\src\\test\\java\\_14_Session\\_1_CopyFileUtil\\sample.pdf",
				 System.getProperty("user.dir") + "\\src\\test\\java\\_14_Session\\_1_CopyFileUtil\\",
				 "newFile");
		System.out.println(System.getProperty("user.dir"));

	}

	/**
	 * This method is developed to copy the data from one file
	 * and add it exact same data into another new file
	 * @param inputFilePath
	 * @param outputFilePath
	 * @param outputFileName
	 */
	public static void copyFile(String inputFilePath, String outputFilePath, String outputFileName) {
		// Path for input file to be copied
		File inputFile = new File(inputFilePath);
		// Path for output file to be created from inputfile
		File outputFile = new File(outputFilePath + outputFileName+".pdf");

		// FileInputStream to read the data from the files into memory
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			// Providing the input and output file path to the file input and output stream
			// constructors
			fileInputStream = new FileInputStream(inputFile);
			fileOutputStream = new FileOutputStream(outputFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured while reading/writing the file");
			e.printStackTrace();
		}

		try {
			// Printing the input file no of bytes on the console
			System.out.println("Number of bytes available in the input file are : " + fileInputStream.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Reading the data from input file untill its zero and writing in the output
		// file
		int i = 0;
		try 
		{
			while ((i = fileInputStream.read()) != -1) {

				fileOutputStream.write(i);

			}
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		} 
		finally 
		{
			// close the fileInputstream
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// close the fileOutputstream
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
