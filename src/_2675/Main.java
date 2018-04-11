package _2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
		 * 
		 * 다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. S에는 QR Code
		 * "alphanumeric" 문자만 들어있다.
		 * 
		 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int repeat = 0;
		String S = "";
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			repeat = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			String output = "";
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < repeat; k++) {
					output += S.substring(j, j + 1);
				}
			}
			System.out.println(output);
		}

	}

}
