package _1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 입력값 = sc.nextInt();
		sc.close();

		boolean isOdd = oddNumber(입력값);
		int tempSum = 0;
		int 분모 = 0;
		int 분자 = 1;
		while (입력값 > tempSum) {
			분모++;
			tempSum += 분모;
		}
		tempSum = 입력값 - (tempSum - 분모) - 1;

		if (isOdd) {
			// 홀수이면 분모가 -- 분자가 ++
			for (int i = 1; i < tempSum; i++) {
				분모++;
				분자--;
			}
		} else {
			// 짝수이면 분모가 ++ 분자가 --
			for (int i = 1; i < tempSum; i++) {
				분모--;
				분자++;
			}
		}
		System.out.println(분모 + "/" + 분자);
	}

	private static boolean oddNumber(int input) {
		if (input % 2 != 0) {
			return true;
		}
		return false;
	}

}
