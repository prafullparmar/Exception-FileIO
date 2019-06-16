package Assgn1_FileIO_Serialization;

import java.io.File;
import java.util.ArrayList;

public class FileExtension {
	 public static void listExtensionFiles(File dir,ArrayList<File> extFile,String ext)
	   {
		   File[] file = dir.listFiles();
		   
		   for(File f:file)
		   {
			   if(f.isDirectory())
			   {
				   
				   listExtensionFiles(f.getAbsoluteFile(),extFile,ext);
			   }
			   else {
				  if(f.getName().endsWith(ext))
				  {
					  extFile.add(f);
				  }
				   
			   }
		   }
	   }
	   public static void printFiles(ArrayList<File> ar,String ext)
	   {
		   int index = 0;
		   System.out.println("File with "+ext+" extension are:");
		   for(File file: ar)
		   {
			   ++index;
			   System.out.println(index+" "+ file.getAbsolutePath());
		   }
	   }
	   public static void deleteFiles(ArrayList<File> ar,String ext)
	   {
		   for(File file: ar)
		   {
			   file.delete();
			  
		   }
		   System.out.println("All Files deleted successfully!");
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<File> extFile = new ArrayList<>();
			String ext = ".txt";
			File file = new File("C:\\program1");
			listExtensionFiles(file,extFile,ext);
			printFiles(extFile,ext);
			deleteFiles(extFile,ext);
;	       
		}


}
