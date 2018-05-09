package _1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 백준 1193번
		 * 
		 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
		 * 
		 * 1/1 1/2 1/3 1/4 1/5 … 2/1 2/2 2/3 2/4 … … 3/1 3/2 3/3 … … … 4/1 4/2 … … … …
		 * 5/1 … … … … … … … … … … … 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> …
		 * 과 같은 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
		 * 
		 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		sc.close();
		int sum = 0;
		int i = 0;
		while (inputNumber > sum) {
			sum += i;
			i++;
		}
		sum = inputNumber - (sum - (i - 1));
		// i가 짝수인지 홀 수 인지
		boolean isodd = oddNumber(i - 1);
		int j = 0;
		for (j = 0; j < sum; j++) {
			i--;
		}
		if (isodd) {
			System.out.println(i + "/" + j);
		} else {
			System.out.println(j + "/" + i);
		}

	}

	private static boolean oddNumber(int input) {
		if (input % 2 != 0) {
			return true;
		}
		return false;
	}
}
