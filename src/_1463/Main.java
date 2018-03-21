package _1463;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;

		if((input = sc.nextInt()) >= 1 && input <= Math.pow(10, 6)) {
			int[] count = new int[input+1];
			
			count[1] = 0;
			
			for(int i = 2; i <= input; i++) {
				count[i] = count[i-1] + 1;
				if(i%3 == 0) {
					count[i] = Math.min(count[i], count[i/3] + 1);
				}
				if(i%2 == 0) {
					count[i] = Math.min(count[i], count[i/2] + 1);
				}
			}
			
			System.out.println(count[input]);
		}
		
		sc.close();
	}
}
