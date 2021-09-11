package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DIsplaying odd position in upper case
		String testStr="welcome to String";
		char[] charArray = testStr.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{//character conversion
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}
			else
			{
				System.out.print(charArray[i]);
			}
		}
		

	}

}
