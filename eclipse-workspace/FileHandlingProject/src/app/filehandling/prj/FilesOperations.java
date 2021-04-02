package app.filehandling.prj;

import java.util.Scanner;

public class FilesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Please select given options in order to perform File Handling Operations"+"\n"+
		                   " 1 : List File"+"\n"+
				           " 2 : Add File"+"\n"+
		                   " 3 : Delete File"+"\n"+
				           " 4 : Search File");
		System.out.println("Enter your option");
		Scanner sc =new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1)
		{
		   System.out.println("Here are the List of files");
		   SortingFiles sf=new SortingFiles();
		   sf.Listfiles();		   
		}
		if(option==2)
		{
			AddingNewFile nf=new AddingNewFile();
			nf.AddFile();			
		}
		if(option==3)
		{
			DeleteAFile df=new DeleteAFile();
			df.deleteFile();
		}
		if(option==4)
		{
			SearchAFile SF=new SearchAFile();
			SF.getFile();
		}		
	       sc.close();  
		}
		catch(IllegalStateException ex)
		{
			ex.printStackTrace();
		}
		}
	}


