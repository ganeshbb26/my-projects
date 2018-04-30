package com.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesInIntegerArray {

	public static void main(String[] args) {

		Integer[] myArray = { 10, 10, 20, 20, 20 };
		// convert the list
		List<Integer> listWithDuplicates = Arrays.asList(myArray);
		// remove duplicates using stream api
		List<Integer> listWithOutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
		// Iterate the list using foreach and print
		// the contents of the list
		listWithOutDuplicates.forEach(i -> System.out.println(i));
	}
}
