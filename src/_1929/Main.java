package _1929;

import java.util.Scanner;

public class Main {
	// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int endNumber = sc.nextInt();
		sc.close();
		int[] dataArray = new int[endNumber + 1];

		for (int i = 0; i < endNumber + 1; i++) {
			dataArray[i] = 1;
		}
		
		dataArray[1] = 0;

		for (int i = 2; i < endNumber + 1; i++) {
			for (int j = 2; i * j <= endNumber; j++) {
				dataArray[i * j] = 0;
			}
		}

		for (int i = firstNumber; i < endNumber + 1; i++) {
			if (dataArray[i] == 1) {
				System.out.println(i);
			}
		}
	}
}
