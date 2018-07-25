package _4948;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
		 * 
		 * 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
		 * 
		 * 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나
		 * 같은 소수는 3개가 있다. (17,19, 23)
		 * 
		 * n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
		 */

		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);

		// 소수를 저장하기 위한 자료구조
		ArrayList<Integer> al = new ArrayList<Integer>();

		int input = scanner.nextInt();
		while (input != 0) {
			int start = input;
			int end = input * 2;
			int size = end - input;

			// 입력받은 값을 저장할 공간
			int[] data = new int[size];
			for (int i = 0; i < size; i++) {
				data[i] = ++start;
			}
			for (int i = 0; i < data.length; i++) {
				// 1의 경우 소수가 아님
				if (data[i] == 1) {
					continue;
				}

				// 2의 경우 소수
				if (data[i] == 2) {
					al.add(data[i]);
					continue;
				}

				// 2부터 i-1까지 나눠지는 수가 없으면 소수
				for (int j = 2; j <= data[i]; j++) {
					// j로 나눠진다면 소수
					if (data[i] % j == 0) {
						break;
					} else if ((j + 1) == data[i]) {
						al.add(data[i]);
						break;
					}
				}
			}

			// print count
			System.out.println(al.size());
			input = scanner.nextInt();
			al = new ArrayList<Integer>();
		}

		scanner.close();

	}
}