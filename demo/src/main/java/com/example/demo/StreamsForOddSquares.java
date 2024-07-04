package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamsForOddSquares
{
	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);		
 
		List<Integer> squaresOfOdd = numbers.stream().filter(n-> n%2!=0).map(n -> n * n).collect(Collectors.toList());
		System.out.println("Square of Odd Numbers : " + squaresOfOdd);
	}
}