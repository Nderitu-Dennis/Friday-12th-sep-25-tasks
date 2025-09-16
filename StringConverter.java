
import java.util.*;


public class StringConverter
{
    
    public void stringOperations(){
      Scanner scanner = new Scanner(System.in);
      
      String str = "";
      
      System.out.println("Enter a string: ");
      str=scanner.nextLine();
      
      //a. converting to propercase
      String properCaseString = str.substring(0,1).toUpperCase() + str.substring(1);
      System.out.println(str + " to proper_case: " + properCaseString);
      
    //   b. counts and returns number of special characters in the string
    
    int counter =0;

    for(int i =0; i<str.length(); i++){
        // extract the character at position i
        char c = str.charAt(i);
        
        if(
            (c >=33 && c<=47) ||
            (c >=58 && c<=64) ||
            (c >=91 && c<=96) ||
            (c >=123 && c<= 126)
            ) {
                counter ++;
                System.out.println("Special character: " + c);
            }
            
        
    }
    
    System.out.println("Total special characters found: " + counter);
    
    // c. sorts the string in descending order based on ASCII values and returns the sorted string
    
// convert the string to an array
char[] arr = str.toCharArray();

// sort
Arrays.sort(arr);

// sort now in descending order by reversing and convert back to a String
String sortedStr = new StringBuilder(new String(arr)).reverse().toString();

System.out.println("Original string: " + str + "\nReversed string: " + sortedStr);
        
            
    }
	public static void main(String[] args) {
	    
	    StringConverter st = new StringConverter();
	    st.stringOperations();
	}
}
