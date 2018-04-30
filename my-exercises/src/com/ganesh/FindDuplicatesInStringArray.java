package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesInStringArray {

	public static void main(String[] args) {

		String[] str = { "hai", "hello", "hai" };
		// convert the string array to list
		List<String> myList = Arrays.asList(str);
		// print the list by removing duplicates
		System.out.println(myList.stream().distinct().collect(Collectors.toList()));
	}
}
