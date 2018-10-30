package Utils;

import java.io.*;
import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.math.*;
import java.math.BigDecimal;

public class MathsUtil {

	public static void mean(List<Long> ints) {
		Long sumOfIntegers = 0L;
		for (Long i : ints)
			sumOfIntegers = sumOfIntegers + i;
		System.out.println(
				(new BigDecimal((((new BigDecimal(sumOfIntegers)).doubleValue()) / ints.size())).setScale(1).doubleValue()));
	}

	public static void median(List<Long> ints) {
		ints.sort(Comparator.naturalOrder());
		boolean isLengthEven = ints.size() % 2 == 0;
		if (isLengthEven) {
			System.out.println((new BigDecimal(((ints.get((ints.size() / 2)) + ints.get(((ints.size() / 2) - 1))) / 2))
					.setScale(1).doubleValue()));
		} else {
			System.out.println((new BigDecimal(((ints.get(((ints.size() - 1) / 2))) / 2))
					.setScale(1).doubleValue()));
		}
	}

	public static void mode(List<Long> ints) {
		ints.sort(Comparator.naturalOrder());
		Map<Long, Long> countFrequencies = ints.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		long maxFrequency = countFrequencies.values().stream().mapToLong(count -> count).max().orElse(-1);
		List<Long> maxFreqList = countFrequencies.entrySet().stream().filter(tuple -> tuple.getValue() == maxFrequency)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		maxFreqList.sort(Comparator.naturalOrder());
		System.out.println(maxFreqList.get(0));

	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		List<Long> inputElements = new ArrayList<>();
		for (int index = 0; index < numberOfElements; index++) {
			inputElements.add(sc.nextLong());
		}
		inputElements.sort(Comparator.naturalOrder());
		mean(inputElements);
		median(inputElements);
		mode(inputElements);
	}
}
