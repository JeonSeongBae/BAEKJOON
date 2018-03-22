package _10718;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 주어진 문자를 출력하는 문제1
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();
	}
}