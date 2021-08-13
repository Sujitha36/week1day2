package assignmentweek1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Declare string 1
		String text1 = "elboww";
		// Declare another String 2
		String text2 = "beloew";
		boolean b = false;
		if (text1.length() == text2.length()) {
			char[] ch = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);

			// System.out.println("Is text1 equals to text2 : " +
			// Arrays.equals(ch, ch2));
			for (int i = 0; i < ch.length - 1; i++) {
				if (ch[i] == ch2[i]) {
					b = true;

				} else {
					b = false;
					break;
				}

			}

			if (b == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not a anagram");
			}

		}
	}
	}

