package com.ganesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class FindNOOfOccurencesUsingStaticMethod {

	public static void main(String[] args) {

		Integer[] myArray = { 10, 10, 20, 20, 20 };
		StringBuilder sb = new StringBuilder();
		// convert the list
		List<Integer> myList = Arrays.asList(myArray);
		// remove duplicates from list
		HashSet<Integer> myHashSet = new LinkedHashSet<Integer>(myList);

		for (Integer x : myHashSet) {
			// check the occurences of the integer
			// in the arrays
			int occurs = findOccurences(myArray, x);
			sb.append(x).append(" occurs ").append(occurs).append(" times").append("\n");
		}
		System.out.println(sb.toString());
	}

	//find occurences of the integer in the array
	static int findOccurences(Integer[] myArray, int x) {
		int res = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == x) {
				res++;
			}
		}
		return res;
	}
}