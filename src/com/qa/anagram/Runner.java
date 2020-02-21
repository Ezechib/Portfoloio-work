package com.qa.anagram;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static boolean Anagam(String a, String b) {
		List<Character> word1 = new ArrayList<>();
		List<Character> word2 = new ArrayList<>();
		for (char c: a.toLowerCase().toCharArray()) {
			word1.add(c);
		}
		for (char c: b.toLowerCase().toCharArray()) {
			word2.add(c);
		}
		word1.sort(null);
		word2.sort(null);
		System.out.println(word1);
		return word1.equals(word2);
	}
}
