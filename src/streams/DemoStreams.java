package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStreams {

	public static void main(String[] args) {
		/* 1 Given the following List of names, using a stream, 
		 * have it print "Hello " in front of each name besides "James".*/
		
		List<String> names = List.of("Michael", "Dean", "James", "Chris");
		
		names.stream().forEach(name -> System.out.println("Hello " + name));
		
		/* 2 Given the following List of Integers, using a stream, 
		have it reduce and print the product (all numbers multiplied together)*/
		List<Integer> numbers = List.of(3, 4, 7, 8, 12);
		
		Optional<Integer> result = numbers.stream().reduce((acc, product) -> {
			return acc * product;
		});
		result.ifPresent(System.out::println);
		
		/* 3 Starting with a list of numbers, use streams to do the following:

			Find the max value.
			Find the min value.
			Remove the odd numbers.
			Remove the even numbers.
			Find the sum of the list.
			Square every number in the list then remove the even numbers and then find the min value.*/
		
		List<Integer> nums = List.of(1,78, 32,3,4,5,6,7,8,9,10,36,90);
		
		System.out.println("Find max: ");
		Optional<Integer> max = nums.stream().reduce((nextNum, currNum) -> {
			if (nextNum > currNum) return nextNum;
			else return currNum;
		});
		max.ifPresent(System.out::println);
		
		System.out.println("Find min: ");
		Optional<Integer> min = nums.stream().reduce((nextNum, currNum) -> {
			if (nextNum < currNum) return nextNum;
			else return currNum;
		});
		min.ifPresent(System.out::println);
		
		System.out.println("Remove the odd numbers: ");
		List<Integer> nonOdd = nums.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(nonOdd);
		
		System.out.println("Remove the even numbers: ");
		List<Integer> nonEven = nums.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
		System.out.println(nonEven);
		
		System.out.println("Find the sum of the numbers: ");
		Optional<Integer> sum = nums.stream().reduce((preNum, currNum) -> preNum + currNum);
		sum.ifPresent(System.out::println);
		
		System.out.println("Find the square of the numbers and then the min: ");
		List<Integer> squares = nums.stream().map(num -> num * num).collect(Collectors.toList());
		Optional<Integer> minOfSquares = squares.stream().reduce(Math::min);
		minOfSquares.ifPresent(System.out::println);
		
	}

}
