package _10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 나머지 연산을 하고 계산한 결과와 계산을 한 결과를 나머지 연산한 결과가 같은지를 살펴봅니다
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		scanner.close();
		System.out.println((A + B) % C);
		System.out.println((A % C + B % C) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
	}
}