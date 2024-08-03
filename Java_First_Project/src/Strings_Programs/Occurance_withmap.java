package Strings_Programs;

import java.util.HashMap;
import java.util.Map;

public class Occurance_withmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sheetal jaswal";
		
		Map<Character,Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(Character chs:ch)
		{
			if(map.containsKey(chs))
			{
				map.put(chs, map.get(chs)+1);
			}
			else
			{
				map.put(chs, 1);
			}
		}
		System.out.println(map);

	}

}
