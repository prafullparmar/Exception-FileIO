package Assgn1_FileIO_Serialization;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class copyFileFromDir {
	public static void copyFile(File f1,File f2)
	  {
		  try {
			  if(f2.exists())
			  {
				  f2.delete();
			  }
			  Files.copy(f1.toPath(),f2.toPath());
			  System.out.println("File "+f1.getName()+" is successfully copied to "+f2.getName() );
		  	  }
		  catch(IOException e){
			  System.out.println("IOException encountered.");
			  e.printStackTrace();
			  
		  }
		 
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			File f1 = new File("C:\\Log\\Assignment1.java");
			File f2 = new File("C:\\program1\\Assi2.java");
			copyFile(f1,f2);
			

		}
}
