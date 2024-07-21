package Strings_Programs;

import java.util.Arrays;

public class First_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am Name and an automation engineer";
		String arr[]=str.split(" ");
		
		Arrays.sort(arr,(a,b)->Integer.compare(a.length(),b.length()));
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

	

}
