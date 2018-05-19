package _2108;

import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은
		 * 홀수라고 가정하자.
		 * 
		 * 산술평균 : N개의 수들의 합을 N으로 나눈 값 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값 최빈값 :
		 * N개의 수들 중 가장 많이 나타나는 값 범위 : N개의 수들 중 최대값과 최소값의 차이 N개의 수가 주어졌을 때, 네 가지 기본 통계값을
		 * 구하는 프로그램을 작성하시오.
		 */
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