package _1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 3 4 10 11 21
		// 2 5 9 12 20
		// 6 8 13 19
		// 7 14 18
		// 15 17
		// 16
		while (true) {
			Scanner sc = new Scanner(System.in);
			int inputNumber = sc.nextInt();
			int sum = 0;
			int i = 0;
			while (inputNumber > sum) {
				sum += i;
				i++;
			}
			sum = inputNumber - (sum - (i - 1));
			// i가 짝수인지 홀 수 인지
			boolean isodd = oddNumber(i - 1);
			int j = 0;
			for (j = 0; j < sum; j++) {
				i--;
			}
			if (isodd) {
				System.out.println(j + "/" + i);
			} else {
				System.out.println(i + "/" + j);
			}

		}
	}

	private static boolean oddNumber(int input) {
		if (input % 2 != 0) {
			return true;
		}
		return false;
	}
}
