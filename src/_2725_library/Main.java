package _2725_library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < N; i++)
			pq.add(Integer.parseInt(br.readLine().trim()));

		while (!pq.isEmpty()) {
			sb.append(pq.poll() + "\n");
		}
		System.out.println(sb);
	}

}