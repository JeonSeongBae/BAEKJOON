package _10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 소문자 string을 입력받음
		String S = sc.next();
		// 개수를 넣어 줄 배열
		int[] count = new int[23];
		// -1로 배열 초기화
		for (int i = 0; i < count.length; i++) {
			count[i] = -1;
		}
		// counting
		for (int i = 0; i < S.length(); i++) {
			count[(int) S.charAt(i) - 97] = i;
		}
		// print
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}

}
