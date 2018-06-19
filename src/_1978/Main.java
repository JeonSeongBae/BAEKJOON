package _1978;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);

		// 입력받을 숫자의 수
		int size = scanner.nextInt();

		// 입력받은 값을 저장할 공간
		int[] data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = scanner.nextInt();
		}

		// 소수인지 확인하는 변수
		int count = 0;

		for (int i = 0; i < data.length; i++) {
			// 1의 경우 소수가 아님
			if (data[i] == 1) {
				continue;
			}

			// 2의 경우 소수
			if (data[i] == 2) {
				count++;
				continue;
			}

			// 2부터 i-1까지 나눠지는 수가 없으면 소수
			for (int j = 2; j <= data[i]; j++) {
				// j로 나눠진다면 소수
				if (data[i] % j == 0) {
					break;
				} else if ((j + 1) == data[i]) {
					count++;
					break;
				}
			}
		}
		scanner.close();

		// print count
		System.out.println(count);
	}
}