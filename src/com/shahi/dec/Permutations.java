package com.shahi.dec;

public class Permutations {
	public static void main(String[] args) {
		String str = "abc";
		int inputLength = str.length();
		boolean[] used = new boolean[str.length()];
		StringBuffer outputString = new StringBuffer();
		char[] input = str.toCharArray();
		doPermute(input, inputLength, outputString, used, 0);

	}

	private static void doPermute(char[] input, int inputLength,
			StringBuffer outputString, boolean[] used, int level) {
		// TODO Auto-generated method stub
		if (level == inputLength) {
			System.out.println(outputString.toString());
			return;
		}

		for (int i = 0; i < inputLength; i++) {
			if (used[i]) {
				continue;
			}
			outputString.append(input[i]);
			used[i] = true;
			doPermute(input, inputLength, outputString, used, level + 1);
			used[i] = false;
			outputString.setLength(outputString.length() - 1);
		}
	}
}
