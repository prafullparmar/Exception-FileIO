package Assgn1_FileIO_Serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFiles {
  public static void copyFile(File f1,File f2)
  {
	  try {
		  FileReader fr = new FileReader(f1.getPath());
		  BufferedReader br = new BufferedReader(fr);
		  FileWriter fw = new FileWriter(f2.getPath()); 
		  String str;
		  while((str = br.readLine())!=null)
		  {
			 fw.write(str+"\n");
			 fw.flush();
		  }
		  fw.close();
		  br.close();
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
		File f2 = new File("C:\\Log\\Assi2.java");
		copyFile(f1,f2);
		

	}

}
