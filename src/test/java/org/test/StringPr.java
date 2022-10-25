package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StringPr {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// polindrome();

		// amstrongNumber();
		reverseString();

	}

	public static void reverseString() {
		String s = "rajappa";

		char[] charArray = s.toCharArray();
		/*int length2 = charArray.length;
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
			
		}*/

		System.out.println("     ");
		Map<Character, Integer> mp = new Hashtable<Character, Integer>();

		for (char c : charArray) {
			if (mp.containsKey(c))
				mp.put(c, mp.get(c) + 1);
			else
				mp.put(c, 1);

		}
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void polindrome() {
		int num = 12321, rev = 0, rem = 0;
		int original = num;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;

		}

		System.out.println(rev);

		if (rev == original)
			System.out.println("It's a polindrome ");
		else
			System.out.println("Not a polindrome");

	}

	public static void amstrongNumber() {

		int num = 153, rev = 0, rem = 0;
		int original = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev + (rem * rem * rem);
			num = num / 10;

		}

		if (rev == original)
			System.out.println("It's a amstrong number ");
		else
			System.out.println("Not a amstrong number");

	}

	public void stringMethods() {

		String s = "Vanja";
		boolean equals = s.equals("Vanaja");
		System.out.println(equals);

		char charAt = s.charAt(0);
		System.out.println(charAt);

		String concat = s.concat("Sadasivam");
		System.out.println(concat);

		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);

		boolean endsWith = s.endsWith("raja");
		System.out.println(endsWith);

		boolean empty = s.isEmpty();
		System.out.println(empty);

		int compareTo = s.compareTo("Rajappa");
		System.out.println(compareTo);

		boolean contains = s.contains("vana");
		System.out.println(contains);

		int length = s.length();
		System.out.println(length);

		String replace = s.replace('a', 'r');
		System.out.println(replace);

		String[] split = s.split("a");

		for (String string : split) {
			System.out.println(string);
		}

		String substring = s.substring(4);
		System.out.println(substring);

		String substring2 = s.substring(1, 4);
		System.out.println(substring2);

		char[] charArray = s.toCharArray();

		for (char c : charArray) {

			System.out.println(c);

		}

		String[] s1 = new String[10];
		s1[0] = "new";
		s1[1] = "mobile";
		s1[2] = "is";
		s1[3] = "Good";
		String string = s1.toString();
		System.out.println(string);

		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(234);
		li.add(876);
		System.out.println(li);

		System.out.println(li.get(0));
		li.add(1, 0);
		System.out.println(li);
		boolean contains1 = li.contains(0);
		System.out.println(contains1);

		int indexOf = li.indexOf(234);
		System.out.println(indexOf);

		boolean empty1 = li.isEmpty();
		System.out.println(empty1);

		Integer remove = li.remove(3);
		System.out.println(remove);

		li.sort(null);

		String string2 = li.toString();

		System.out.println(string2);

		boolean startsWith = string2.startsWith("[");
		System.out.println(startsWith);

	}

}
