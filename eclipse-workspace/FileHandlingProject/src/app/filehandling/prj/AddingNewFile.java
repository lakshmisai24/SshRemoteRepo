package app.filehandling.prj;
import java.io.*;
import java.util.Scanner;

public class AddingNewFile 
{
	public void AddFile()
	{
      System.out.println("Enter new File name");
      try
      {
	  Scanner sc=new Scanner(System.in);
	  String Filename=sc.next();
	  
	  if(!(Filename.equals(null)))
	  {
	  File file=new File("/Users/Sreekanth/Desktop/MyFiles/"+Filename);
	  
	  if(file.createNewFile())
	   {
		System.out.println(file.getName()+" created successfully");
		}
		else
		{
		System.out.println("File name  can't be null/empty");
		}
		sc.close();
		}
      }
		catch(IOException e)
        {
			e.printStackTrace();
		}
      
		
	}
}
	
