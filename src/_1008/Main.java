package _1008;

import java.util.Scanner;

public class Main {
	// 두 수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextInt();
		double B = scanner.nextInt();
		scanner.close();
		System.out.println(A / B);
	}
}
