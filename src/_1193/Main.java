package _1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		boolean odd = oddNumber(input);
		int sum = 0;
		int i = 0;
		while (input > sum + (i + 1)) {
			i++;
			sum +=i;
		}
		
		if (odd) {

		} else {

		}
	}

	private static boolean oddNumber(int input) {
		if (input % 2 != 0) {
			return true;
		}
		return false;
	}

}
