package _9020;

import java.util.Scanner;

public class Main {
	// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int endNumber = sc.nextInt();
		boolean[] data = new boolean[10001];

		for (int i = 2; i * i < 10001; i++) {
			if (!data[i]) {
				for (int j = i * i; j < 10001; j += i) {
					data[j] = true;
				}
			}
			data[1] = true;
		}
		sc.close();

	}
}
