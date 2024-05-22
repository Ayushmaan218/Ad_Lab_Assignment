package stringMatching;

import java.util.ArrayList;

public class NaiveBruteForceAlgo {

	public static ArrayList<Integer> Naive(String pattern, String text) {
		int n = text.length();
		int m = pattern.length();

		char patternChars[] = pattern.toCharArray();
		char textChars[] = text.toCharArray();

		ArrayList<Integer> list = new ArrayList<>();
		int shift, j;

		for (shift = 0; shift <= n - m; shift++) {
			for (j = 0; j < m; j++) {
				if (patternChars[j] != textChars[shift + j])
					break;
			}
			if (j == m)
				list.add(shift - 1);
		}
		return list;

	}

	public static void main(String[] args) {
		String text = "abccbacbabcabcacabcabc";
		ArrayList<Integer> arr = Naive("abc", text);
		if (arr.isEmpty()) {
			System.out.println("Pattern not found .");
		} else {
			System.out.println("The pattern is present at: ");
			for (int i = 0; i < arr.size(); i++) {
				System.out.print(arr.get(i) + " ");
			}
		}
	}

}
