package _10869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 모든 사칙연산 해보기
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
}