package _8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의
		 * 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
		 * 
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * 
		 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String OX = sc.nextLine();
		for (int i = 0; i < size; i++) {
			OX = sc.nextLine();
			int result = 1;
			int score = 0;
			for (int j = 0; j < OX.length(); j++) {
				if (OX.charAt(j) == 'O') {
					score += result;
					result++;
				} else {
					result = 1;
				}
			}
			System.out.println(score);
		}
	}
}
