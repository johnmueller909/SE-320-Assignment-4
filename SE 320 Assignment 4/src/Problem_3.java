import java.util.*;
import java.text.*;

public class Problem_3 {
	
	public static void main(String[] args) {
		
		//This section displays code to format 12345.678 in the UK locale
		NumberFormat part1 = NumberFormat.getInstance(Locale.UK);
		part1.setMaximumFractionDigits(2);
		System.out.println(part1.format(12345.678));
		
		//This section displays code to format 12345.678 in U.S Currency
		NumberFormat part2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(part2.format(12345.678));
		
		//This sections is to parse 12345.678 into a number
		NumberFormat part3 = NumberFormat.getInstance(Locale.US);
		  try {
				  Number number = part3.parse("12345.678");
				  System.out.println(number.doubleValue());
			   }
		  catch (java.text.ParseException ex) {
				  
			  System.out.println("Parse failed"); 
				  
				}
		
	}

}
