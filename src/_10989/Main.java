package _10989;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[10001];
		// 10000000 개이기 때문에 sort를 사용하면 안된다.
		for (int i = 0; i < N; i++) {
			arr[sc.nextInt()]++;
		}

		for (int i = 1; i < 10000; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					System.out.println(i);
				}
			}
		}
	}

}