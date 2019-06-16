package Assignment1;
import java.io.File;
import java.io.FileReader; 
import java.io.FileNotFoundException;
import java.util.logging.*;
public class exceptionHandling {

		public static void main(String[] args) {
			Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
			int array[] = new int[5];
	        File file = new File("C:\\Log\\file.txt");
	        int temp;
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
