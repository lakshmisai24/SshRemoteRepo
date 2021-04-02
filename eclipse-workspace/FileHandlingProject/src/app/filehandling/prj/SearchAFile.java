package app.filehandling.prj;
import java.io.*;
import java.util.Scanner;

public class SearchAFile {
	public void getFile()
	{		 
		 int count=0;
		 File filename=null;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter File name to be searched");
		 String name=sc.next();
		 try
		 {
		 File directory=new File("/Users/Sreekanth/Desktop/MyFiles/");
		 File[] files=directory.listFiles();
		 if(files.length>0)
		 {
		    for(File file:files)
		     {			
				if(name.equals(file.getName()))
				{
					count=1;
					filename=file;
				}	     		 
		     }
		  }
		 }		 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 //checking for the file
		 if(count==1)
				System.out.println(filename.getName()+" file is found in the given path "+filename.getPath());
			 else
				 if(count==0)
				 System.out.println("File not found");	
		 sc.close();
		 } 
	}

		 
		 
