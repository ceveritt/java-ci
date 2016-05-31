package com.example.ci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

	public String stringReverse(String s) {
		if (s == null) {
			return null;
		}
		StringBuffer sb = new StringBuffer(s.length());
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public String wordJumble(String sentence) {
		if (sentence == null) {
			return null;
		}
		if (sentence.length() <= 2) {
			return sentence;
		}
		String[] words = sentence.split("\\s+");
		StringBuffer sb = new StringBuffer(sentence.length());
		for (String word : words) {
			if (word.length() > 2) {
				List<Character> chars = new ArrayList<>();
				for (char c : word.substring(1, word.length() - 1).toCharArray()) {
					chars.add(c);
				}
				Collections.shuffle(chars);
				if (sb.length() > 0) {
					sb.append(' ');
				}
				sb.append(word.charAt(0));
				for (Character c : chars) {
					sb.append(c);
				}
				sb.append(word.charAt(word.length() - 1));
			} else {
				if (sb.length() > 0) {
					sb.append(' ');
				}
				sb.append(word);
			}
		}
		return sb.toString();
	}

}
