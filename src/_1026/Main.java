package _1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
	// 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
	// S = A[0]*B[0] + ... + A[N-1]*B[N-1]
	// S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안된다.
	// S의 최솟값을 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int A[] = new int[num];
		int B[] = new int[num];

		for (int i = 0; i < num; i++) {
			A[i] = scanner.nextInt();
		}
		for (int j = 0; j < num; j++) {
			B[j] = scanner.nextInt();
		}
		scanner.close();

		Arrays.sort(A);
		Arrays.sort(B);

		int S = 0;
		for (int i = 0; i < num; i++) {
			S = S + A[i] * B[num - 1 - i];
		}

		System.out.println(S);

	}
}
