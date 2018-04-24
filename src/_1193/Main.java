package _1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		boolean odd = oddNumber(input);
		int sum = 0;
		int up = 0;
		int down = 1;
		while (input > sum) {
			up++;
			sum += up;
		}
		sum = input - (sum - up) - 1;

		if (odd) {
			// 홀수이면 분모가 -- 분자가 ++
			for (int i = 0; i < sum; i++) {
				up++;
				down--;
			}
		} else {
			// 짝수이면 분모가 ++ 분자가 --
			for (int i = 0; i < sum; i++) {
				up--;
				down++;
			}
		}
		System.out.println(up);
		System.out.println(down);
	}

	private static boolean oddNumber(int input) {
		if (input % 2 != 0) {
			return true;
		}
		return false;
	}

}
