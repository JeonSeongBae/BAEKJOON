package _11720;

import java.util.Scanner;

public class Main {
	// 입력받은 문자를 출력하는 문제2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String input = sc.next();
		int remainder = 0;
		for (int i = 0; i < size; i++) {
			int a = Integer.parseInt(input.substring(i, i + 1));
			remainder += a;
		}

		System.out.println(remainder);
	}
}