package com.demo.prj;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

	    static void duplicateCharCount(String inputString)
	    {
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	        char[] strArray = inputString.toCharArray();
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	                charCountMap.put(c, 1);
	            }
	        }
	 
	        //Getting a Set containing all keys of charCountMap
	        Set<Character> charsInString = charCountMap.keySet();
	 
	        System.out.println("Duplicate Characters In "+inputString);
	 
	        //Iterating through Set 'charsInString'
	        for (Character ch : charsInString)
	        {
	            if(charCountMap.get(ch) > 1)
	            {
	                //If any char has a count of more than 1, printing it's count
	                System.out.println(ch +" : "+ charCountMap.get(ch));
	            }
	        }
	    }
	
	
	
	public static void main(String[] args)
    {
       duplicateCharCount("JavaJ2EE");
       duplicateCharCount("Fresh Fish");
       duplicateCharCount("Better Butter");
    }
	
	
}
