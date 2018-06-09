package _1001;

import java.util.Scanner;

public class Main {
	// 두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		System.out.println(A - B);
	}
}
