package _1065;

import java.util.Scanner;

public class Main {
	/*
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
	 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (1 <= n && n <= 1000) {
			if (n < 100) {
				System.out.println(n);
			} else {
				int count = 99;
				for (int i = 100; i <= n; i++) {
					// 100의 자리
					int hundred = i / 100;
					// 10의 자리
					int ten = (i / 10) % 10;
					// 1의 자리
					int one = i % 10;
					if ((hundred - ten) == (ten - one)) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}