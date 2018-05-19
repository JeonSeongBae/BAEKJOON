package _2108;

import java.util.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // 반복횟수
		int[] array = new int[size]; // 입력받는 정수
		int[] m = new int[8001]; // 최빈값 배열
		int sum = 0;
		int count = 0;

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}

		Arrays.sort(array);

		int x = 0;
		for (int i = 0; i < size; i++) {
			m[array[i] + 4000]++;
			x = Math.max(x, m[array[i] + 4000]);

		}
		int second = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == x) {
				count++;
				second = i - 4000;
			}
			if (count == 2) {
				second = i - 4000;
				break;
			}
		}

		System.out.println((int) Math.round((double) sum / (double) size));
		System.out.println(array[(int) (size / 2)]);
		System.out.println(second);
		System.out.println(array[size - 1] - array[0]);
	}

}