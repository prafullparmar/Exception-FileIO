package Assgn1_FileIO_Serialization;

import java.io.File;

public class listFiles {
   public static void dirWalk(File dir)
   {
	   File[] file = dir.listFiles();
	   for(File f:file)
	   {
		   if(f.isDirectory())
		   {
			   System.out.println("Dir: "+f.getAbsolutePath());
			   System.out.println("Dir Contents:");
			   dirWalk(f.getAbsoluteFile());
		   }
		   else {
			   System.out.println(" File: " +f.getAbsolutePath());
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dirWalk(new File("C:\\program1\\IO File Handeling Assignment"));
       
	}

}
