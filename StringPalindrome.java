package week2.day1;

public class StringPalindrome {

	public static void main(String[] args)
	{
		
	 String input=new String("meadam");
	//Declare another String rev value as ""
	 String rev="";
	 //System.out.println(rev);
	 //Iterate over the String in reverse order
	 for (int i=input.length()-1;i>=0;i--)
{
		//	System.out.println("The first"+rev);
	rev=rev+input.charAt(i);
//	System.out.println("the"+rev);
}
	/* boolean value1 = input.equals(rev);
	 boolean equalsIgnoreCase = input.equalsIgnoreCase(rev);*/
	 if(rev.equals(input))
	 {
		System.out.println("The "+input+ " is palindrome");
	 }
	 
	
	else
	{
		System.out.println("The "+input+ " not a palindrom");
	}
	
	}

}
