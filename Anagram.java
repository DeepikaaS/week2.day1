package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare a String 
		String text1 = "stops";
		// Declare another String
		String text2 = "potss";
		// Check length of the strings are same then (Use A Condition)
		int text1length = text1.length();
		System.out.println("the text1length " + text1length);
		int text2length = text2.length();
		System.out.println("the text2length " + text2length);
		// Convert both Strings in to characters
		
		  char[] charArray1= text1.toCharArray(); char[] charArray2=
		  text2.toCharArray();
		 
		if (text1length == text2length) {
			// Convert both Strings in to characters
			//char[] charArray1 = text1.toCharArray();
			//char[] charArray2 = text2.toCharArray();
			System.out.println(charArray1);
			System.out.println(charArray2);
			// for(int i=0;i<charArr)
			// Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			// Check both the arrays has same value
			/*
			 * boolean equals = charArray1.equals(charArray2); System.out.println(equals);
			 * if(equals==true) { System.out.println("The "+text1+"and" +text2+
			 * "is satifying anagram condition"); }
			 */
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println("The "+text1+" and " +text2+"is satifying anagram condition");

				System.out.println("inputs Values are same value ");
			} else
				System.out.println("inputs are not same value");

		} else
			System.out.println("inputs are not same values");

	}

}
