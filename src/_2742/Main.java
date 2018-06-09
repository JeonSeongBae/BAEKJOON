package _2742;

import java.util.Scanner;

public class Main {
	// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < N; i++) {
			System.out.println(N - i);
		}
	}
}