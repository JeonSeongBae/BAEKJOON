package _1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
		 * 
		 * 소문자를 구분하지 않는다. A'65' _ Z'90' / a'97' _ z'122'
		 */
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		input = input.toUpperCase();
		int[] alpha = new int[26];

		for (int i = 0; i < input.length(); i++) {
			alpha[input.charAt(i) - 65]++;
		}

		int max = -1;
		int maxIndex = -1;
		boolean duplication = false;
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > max) {
				duplication = false;
				max = alpha[i];
				maxIndex = i;
			} else if (alpha[i] == max) {
				duplication = true;
			}
		} // end for()
		if (duplication) {
			System.out.println("?");
		} else {
			System.out.println((char) (maxIndex + 65));
		}
	}
}