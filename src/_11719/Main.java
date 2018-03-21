package _11719;

import java.util.Scanner;

public class Main {
	// 입력받은 문자를 출력하는 문제2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();
	}
}