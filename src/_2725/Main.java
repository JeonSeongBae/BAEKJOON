package _2725;

import java.util.Scanner;

public class Main {
	static int size;
	static int[] A; public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		A = new int[size + 1]; // heap배열의 기본크기

		for (int i = 1; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		BULIDMAXHEAP(A);
		print(A);
	}

	private static void BULIDMAXHEAP(int[] A) {
		for (int i = size; i >= 1; i--) {
			MAXHEAPIFY(A, i);
		}
	}

	private static void MAXHEAPIFY(int[] A, int i) {
		int L = LEFTCHILD(i);
		int R = RIGHTCHILD(i);
		int largest;
		if (L <= size && A[L] < A[i]) {
			largest = L;
		} else {
			largest = i;
		}
		if (R <= size && A[R] < A[largest]) {
			largest = R;
		}
		if (largest != i) {
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			MAXHEAPIFY(A, largest);
		}
	}

	public int max(int[] A) {
		if (size < 1) {
			return -1;
		}
		return A[1];
	}

	private static void print(int[] A) {
		for (int i = 1; i < A.length; i++) {
			System.out.println(extract_max(A));
			BULIDMAXHEAP(A);
		}
	}

	public static int extract_max(int[] A) {
		int max = A[1];
		A[1] = A[size];
		A[size--] = 0;
		return max;
	}

	public static int PARENT(int i) {
		return i / 2;
	}

	public static int LEFTCHILD(int i) {
		return 2 * i;
	}

	public static int RIGHTCHILD(int i) {
		return (2 * i) + 1;
	}

}