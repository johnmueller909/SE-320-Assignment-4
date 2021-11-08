import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Write a program that reads words from a text file 
 * and displays all the nonduplicate words in ascending order. 
 * (Use a TreeSet to hold the words)
 */

public class Problem_2 {
		
	public static void main(String[] args) {
	        
		if(args.length > 1){
			
	            String fileName = args[0];
	            TreeSet<String> set = new TreeSet<>();
	            File file = new File(fileName);
	            
	            try {
	                Scanner scan = new Scanner(file);
	                while (scan.hasNext()){
	                    set.add(scan.next());
	                }
	                System.out.println(set);
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	            }
	        }else{
	            System.out.println("Must pass a file name into the command line!");
	        }
	    }
	}
