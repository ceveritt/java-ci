package com.example.ci;

public class Example {

	public String stringReverse(String s){
		StringBuffer sb =  new StringBuffer(s.length());
		for(int i = s.length() - 1; i >= 0; i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
