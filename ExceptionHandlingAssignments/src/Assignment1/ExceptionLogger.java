package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLogger {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		int array[] = new int[5];
        File file = new File("C:\\Log\\file.txt");
        int temp;
        try {
        FileHandler fh1 = new FileHandler("C:\\Users\\prafull.parmar\\Desktop\\ExceptionLogs.txt");
        logger.addHandler(fh1);
        FileHandler fh2 = new FileHandler("C:\\Users\\prafull.parmar\\Downloads\\ExceptionLogs.txt");     
        logger.addHandler(fh2);
        }
        catch( SecurityException| IOException e)
        {
        	e.printStackTrace();
        }
        try {
        	temp = 10/0;
        }
        catch(ArithmeticException e){
        	System.out.println("Caught an Arithmetic Exception...");
            logger.log(Level.INFO, e.getMessage());
            
        }  
        try {
        	array[7] = 25;
        	
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("Caught an Array Index Out Of Bounds Exception...");
            logger.log(Level.SEVERE, e.getMessage());
        }
        try {
        	FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException e){
        	System.out.println("Caught File Not Found Exception...");
        	logger.log(Level.SEVERE, e.getMessage());
        }
       
    }

}
