package _1463;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		if((input = sc.nextInt()) >= 1 && input <= Math.pow(10, 6)) {
			int count = 0;
			while(input != 1) {
				if(input%3 == 0) {
					input = input/3;
				}
				else if(input%2 == 0) {
					input = input/2;
				}
				else {
					input = 1;
				}
				count++;
				
				System.out.println(input);
			}
		}
		
		sc.close();
	}
}
