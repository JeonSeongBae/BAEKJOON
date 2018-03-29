package _1592;

import java.util.Scanner;
import java.util.StringTokenizer;

/* 영식이와 친구들이 원형으로 모여서 시계방향으로 1부터 N까지 적혀있는 자리에 앉는다. 영식이와 친구들은 공 던지는 게임을 하기로 했다. 게임의 규칙은 다음과 같다.
일단 1번 자리에 앉은 사람이 공을 받는다. 그리고 나서 공을 다른 사람에게 던진다. 다시 공을 받은 사람은 다시 공을 던지고, 무한 반복을 한다. 어떤 사람이 공을 받았는데, 만약 그 사람이 공을 M번 받았으면 게임은 끝난다. 반대로 어떤 사람이 공을 M번보다 작게 받았으면 현재 공을 받은 횟수가 (지금 받은 공도 친다.) 홀수번이면 자기의 현재 위치에서 오른쪽으로 L번째 있는 사람에게, 짝수번이면 자기의 현재 위치에서 왼쪽으로 L번째 있는 사람에게 공을 던진다.
공을 총 몇 번 던지는지 구하는 프로그램을 작성하시오. */

public class Main {
	// 입력받은 문자를 출력하는 문제2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer st = new StringTokenizer(a, " ");

		int[] NML = new int[3];
		for (int i = 0; st.hasMoreTokens(); i++) {
			NML[i] = Integer.parseInt(st.nextToken());
		}

		int[] arrayN = new int[NML[0]];
		int index = 0;
		int count = 0;
		arrayN[0] = 1;

		while (arrayN[index] != NML[1]) {
			if (NML[1] % 2 == 0) {
				// 짝 수, 시계 방향, +
				arrayN[(index + NML[2]) % NML[0]]++;
				index = (index + NML[2]) % NML[0];
				count++;
			} else {
				// 홀 수, 반시계 방향, -
				arrayN[(index + (arrayN.length - NML[2])) % NML[0]]++;
				index = (index + (arrayN.length - NML[2])) % NML[0];
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}