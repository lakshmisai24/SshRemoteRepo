package app.filehandling.prj;
import java.util.Scanner;
import java.io.*;

public class DeleteAFile {
	
	public void deleteFile()
	{
		System.out.println("Enter a File name which u want to delete");
		try
		{
	    Scanner sc=new Scanner(System.in);
		String name=sc.next();
		File Filename=new File("/Users/Sreekanth/Desktop/MyFiles/"+name);
		if(Filename.exists())
		{
			Filename.delete();		  		
			System.out.println("File successfully deleted");
		}
		else
		{
			System.err.println("Cannot find a file "+ name +" in this path /Users/Sreekanth/Desktop/MyFiles/");
		}
		sc.close();
	    }

		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
