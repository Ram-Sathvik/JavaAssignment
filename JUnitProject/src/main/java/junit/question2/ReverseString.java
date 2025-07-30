package junit.question2;

public class ReverseString {

	public static String reverse(String input) {
		
	    if (input == null) 
	    	return null;
        return new StringBuilder(input).reverse().toString();
	}
}