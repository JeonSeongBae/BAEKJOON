package _2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		/*
		 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는
		 * 1로, d는 2로, ..., C를 8로 바꾼다.
		 * 
		 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed
		 * 이다.
		 * 
		 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int index = 0;
			while (st.hasMoreTokens()) {
				arr[index++] = Integer.parseInt(st.nextToken());
			}
			if (checkAscending(arr)) {
				System.out.println("ascending");

			} else if (checkdescending(arr)) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean checkdescending(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] - 1 != arr[i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkAscending(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i] - 1) {
				return false;
			}
		}
		return true;
	}

}
