package _4673;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] d = new int[10001];
		for (int i = 0; i < 10000; i++) {
			d[dn(i)] = 1;
			if (d[i] != 1) {
				System.out.println(i);
			}
		}

	}

	static int dn(int i) {
		int res = i;
		if (i >= 10000) {
			res += i / 10000;
			i %= 10000;
		}
		if (i >= 1000) {
			res += i / 1000;
			i %= 1000;
		}
		if (i >= 100) {
			res += i / 100;
			i %= 100;
		}
		if (i >= 10) {
			res += i / 10;
			i %= 10;
		}
		return res += i;
	}
}