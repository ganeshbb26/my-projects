package com.ganesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class FindNOOfOccurencesUsingCollectionsAPI {

	public static void main(String[] args) {

		Integer[] myArray = { 10, 10, 20, 20, 20 };
		StringBuilder sb = new StringBuilder();
		// convert the list
		List<Integer> myList = Arrays.asList(myArray);
		// remove duplicates from list
		HashSet<Integer> myHashSet = new LinkedHashSet<Integer>(myList);
		// Iterate myHashset and
		// check the frequency of each
		// integer
		for (Integer x : myHashSet) {
			sb.append(x).append(" occurs ").append(Collections.frequency(myList, x)).append(" times").append("\n");
		}
		System.out.println(sb.toString());
	}
}