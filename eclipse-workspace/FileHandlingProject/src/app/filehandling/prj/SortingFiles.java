package app.filehandling.prj;

import java.io.File;
//import java.util.Iterator;
import java.util.TreeSet;

public class SortingFiles {	
	public void Listfiles()
	{
	File dir = new File("/Users/Sreekanth/Desktop/MyFiles");
	File[] files = dir.listFiles();
	TreeSet<File> set = new TreeSet<>();
	for(File file : files)
	{
		set.add(file);
		System.out.print(file.getName()+"\n");
	}	
}

}


