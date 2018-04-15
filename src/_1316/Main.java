package _1316;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int output = size;
		for (int i = 0; i < size; i++) {
			String input = br.readLine();
			boolean[] exist = new boolean[26];
			for (int j = 1; j < input.length(); j++) {
				if (input.charAt(j - 1) != input.charAt(j)) {
					if (exist[input.charAt(j) - 97] == true) {
						output--;
						break;
					}
					exist[input.charAt(j - 1) - 97] = true;
				}
			}
		}
		System.out.println(output);
	}
}
