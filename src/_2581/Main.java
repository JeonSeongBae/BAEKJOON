package _2581;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);

		// 소수를 저장하기 위한 자료구조
		ArrayList<Integer> al = new ArrayList<Integer>();

		// 입력받을 숫자의 수
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int size = end-start;
		
		// 입력받은 값을 저장할 공간
		int[] data = new int[size+1];
		for (int i = 0; i <= size; i++) {
			data[i] = start++;
		}

		// 소수인지 확인하는 변수
		boolean count = false;

		for (int i = 0; i < data.length; i++) {
			// 1의 경우 소수가 아님
			if (data[i] == 1) {
				continue;
			}

			// 2의 경우 소수
			if (data[i] == 2) {
				al.add(data[i]);
				count = true;
				continue;
			}

			// 2부터 i-1까지 나눠지는 수가 없으면 소수
			for (int j = 2; j <= data[i]; j++) {
				// j로 나눠진다면 소수
				if (data[i] % j == 0) {
					break;
				} else if ((j + 1) == data[i]) {
					al.add(data[i]);
					count = true;
					break;
				}
			}
		}
		scanner.close();

		// print count
		if (count) {
			System.out.println("-1");
		} else {
			int total = 0;
			for (int i = 0; i < al.size(); i++) {
				total += al.get(i);
			}
			System.out.println(total);
			System.out.println(al.get(0));
		}
	}
}