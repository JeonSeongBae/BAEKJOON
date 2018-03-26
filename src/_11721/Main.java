package _11721;

import java.util.Scanner;

public class Main {
	// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
	//
	// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		for (int i = 1; i <= input.length(); i++) {
			System.out.print(input.substring(i - 1, i));
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}