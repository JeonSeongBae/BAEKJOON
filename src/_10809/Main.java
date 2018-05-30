package _10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어
		 * 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		// 소문자 string을 입력받음
		String S = sc.next();
		sc.close();
		// 개수를 넣어 줄 배열
		int[] count = new int[26];
		// -1로 배열 초기화
		for (int i = 0; i < count.length; i++) {
			count[i] = -1;
		}
		// counting
		for (int i = 0; i < S.length(); i++) {
			if (count[(int) S.charAt(i) - 97] == -1) {
				count[(int) S.charAt(i) - 97] = i;
			}
		}
		// print
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}
}