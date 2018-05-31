package _2960;

import java.util.Scanner;

public class Main {
	// 에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.

	// 이 알고리즘은 다음과 같다.
	// 1.2부터 N까지 모든 정수를 적는다.
	// 2.아직 지우지 않은 숫자 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
	// 3.P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
	// 4.아직 모든 숫자를 지우지 않았다면, 다시 2번 단계로 간다.

	// N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int count = 0;
		int[] array = new int[n + 1];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			if (count == k) {
				break;
			}
			if (array[i] == 1) {
				continue;
			}
			for (int d = i; d <= n; d += i) {
				if (array[d] == 1) {
					continue;
				}
				if (array[d] == 0) {
					array[d]++;
					count++;
				}
				if (count == k) {
					System.out.println(d);
					break;
				}
			}
		}
	}
}
