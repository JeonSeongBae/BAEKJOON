package _2739;

import java.util.Scanner;

public class Main {
	// 두 수를 입력받고 합을 출력하는 문제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
