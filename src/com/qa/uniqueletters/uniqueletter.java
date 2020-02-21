package com.qa.uniqueletters;

import java.util.LinkedHashSet;
import java.util.Set;

public class uniqueletter {
	 public String UniqueList(String sentence) {
			Set<Character> uniqueLetterList= new  LinkedHashSet<Character>();//
			String sen= sentence.replace(" ", "").toLowerCase();
			String uniqueString ="";
			 for (int i=0; i<sen.length();i++) {
				 char currentLetter= sen.charAt(i);
				 uniqueLetterList.add(currentLetter);
			 }
			 for(char c:uniqueLetterList) {
				 uniqueString= uniqueString+c;
			 }
			return uniqueString;
		 }
		}