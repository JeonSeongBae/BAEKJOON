package _10844;

import java.util.Scanner;

public class Main {
	//45656이란 수를 보자.
	//이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
	//세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
	//N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    long[][] numN = new long[101][11];
	 
	    for (int i = 1; i <= 9; i++) {
	    	numN[1][i] = 1;
	    }
	    numN[1][0] = 0;
	    
	    for (int i = 2; i <= n; i++) {
	        for (int j = 0; j < 10; j++) {
	        	if(j==0) {
	        		numN[i][j]=numN[i-1][j+1];
	        	}
	        	else if(j==9) {
	        		numN[i][j]=numN[i-1][j-1]% 1000000000;
	        	}
	        	else {
	        		numN[i][j] = numN[i-1][j-1] + numN[i-1][j+1]% 1000000000;
	        	}
	        }
	    }

	    long sum = 0;
	    for (int i = 0; i < 11; i++) {
	        sum += numN[n][i];
	    }
	    System.out.println(sum% 1000000000);
		
	}
}