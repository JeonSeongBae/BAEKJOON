package _1475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
		 * 
		 * 다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 다솜이의 방 번호가 주어졌을
		 * 때, 필요한 세트의 개수의 최소값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
		 */
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		int[] number = new int[10];
		int many = 0;
		sc.close();
		for (int i = 0; i < input.length; i++) {
			number[input[i] - 48]++;
		}
		number[6] += number[9];
		for (int i = 0; i < number.length - 1; i++) {
			if (i == 6) {
				if (number[i] % 2 == 0 && many < number[i] / 2) {
					// 짝 수
					many = number[i] / 2;
				} else if (many < number[i / 2] + 1) {
					// 홀 수
					many = number[i] / 2 + 1;
				}
			} else if (many < number[i]) {
				many = number[i];
			}
		}
		System.out.println(many);
	}

}
