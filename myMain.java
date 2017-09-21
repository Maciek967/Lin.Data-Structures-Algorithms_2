import java.util.ArrayList;

public class myMain {

	//--------------------------------------------------
	//	reverse
	//--------------------------------------------------
	/**
	 * 
	 * The function reverses a String. 
	 * 
	 * @param s: String to be scanned. 
	 * @return A new String, whose content is the reverse of the input one.
	 * 
	 */
	public static String reverse(String s){
		//i. Extra arguments to represent the information? 

		//ii. Extra information needed, purely for articulating the manipulation of information

		//iii. Operations to manipulate the information

		//iv. Return the output information
		String string= "";
		int length = s.length();
		for (int i=length-1; i>=0; i--) 
		{
			string = string + s.charAt(i);
		}

		return string;
	}

	//--------------------------------------------------
	//	isPalindrome
	//--------------------------------------------------
	/**
	 * 
	 * The function checks if a String is a palindrome. 
	 * 
	 * @param s: String to be scanned.
	 * @return If the String is a palindrome or not.
	 * 
	 */
	public static boolean isPalindrome(String s){
		//i. Extra arguments to represent the information? 

		//ii. Extra information needed, purely for articulating the manipulation of information

		//iii. Operations to manipulate the information

		//iv. Return the output information		
		int n = s.length();
		for( int i = 0; i < n/2; i++ )
		{
			if (s.charAt(i) != s.charAt(n-i-1)) 
			{
				return false;
			}
		}
		return true;  
	}


	//--------------------------------------------------
	//	charAppearingTheMost
	//--------------------------------------------------	
	/**
	 * 
	 * The function scans a String to get the character appearing the most on it. 
	 * 
	 * @param s: String to be scanned 
	 * @return The character appearing the most in the String.
	 * 
	 */
	public static char charAppearingTheMost(String s){
		//i. Extra arguments to represent the information? 

		//ii. Extra information needed, purely for articulating the manipulation of information

		//iii. Operations to manipulate the information

		//iv. Return the output information		
		char[] array = s.toCharArray();
		int charCount = 0;
		int charCountMax = 0;
		char charMax = 0;
		for (int i = 0; i < array.length; i++ )
		{
			char c = array[i];

			for (int j = i + 1; j < array.length; j++) 
			{
				char ch = array[j];

				if (c == ch)
				{
					charCount++;
				}

			}
			if(charCount > charCountMax)
			{
				charMax = c;
				charCountMax = charCount;
			}


		}
		return charMax;
	}


	//--------------------------------------------------
	//	MAIN
	//--------------------------------------------------		
	/**
	 * 
	 * Main Method: Used to test the 3 algorithms.
	 * @param args: We will run the program parameter free, so do not worry about it.
	 * 
	 */	
	public static void main(String[] args) {
		// i) Collect the program input arguments
		String arg = "madam";

		// Call to the main function of the application we want to deal with
		// 1. Reverse the String
		String res1 = reverse(arg);
		System.out.println(res1);

		// 2. Check if the String is a palindrome
		boolean res2 = isPalindrome(arg);
		System.out.println(res2);

		// 3. Count the character appearing the most in the String
		char res3 = charAppearingTheMost(arg);
		System.out.println(res3);
	}

}
