package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		String text = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;
		//boolean up = true;
		// Build the logic to find the count of each
		// Pseudo Code:
		// a) Convert the String to character array
		char[] charArray = text.toCharArray();

		// b) Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
			// boolean letter2 = Character.isLetter(charArray[i]);
			// if(up==letter2)
			if (Character.isLetter(charArray[i])) {
				letter++;
			//	System.out.println("The letter " + letter + " is " + charArray[i]);
			} else if (Character.isDigit(charArray[i])) {
				num++;
				//System.out.println("The digit " + num + " is " + charArray[i]);
			}

			else if (Character.isWhitespace(charArray[i])) {
				space++;
				//System.out.println("The Whitespace " + space + " is " + charArray[i]);

			} else {
				specialChar++;
				//System.out.println("The special characters" + charArray[i] + " count is" + specialChar);
			}
		}
		System.out.println("The Types present in given String are");
		System.out.println("The count of letters present : " +letter);
		System.out.println("The count of num present : " +num );
		System.out.println("The count of space present : " +space );
		System.out.println("The count of specialCharacter present : " +specialChar);
	}

}
