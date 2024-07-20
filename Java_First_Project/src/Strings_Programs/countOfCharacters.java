package Strings_Programs;

public class countOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sheetal Jaswal";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total Number of characters "+count);

	}

}
