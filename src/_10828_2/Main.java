package _10828_2;

import java.util.*;

public class Main {
	// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	// 명령은 총 다섯 가지이다.
	// •push X: 정수 X를 스택에 넣는 연산이다.
	// •pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	// •size: 스택에 들어있는 정수의 개수를 출력한다.
	// •empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	// •top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받을 커맨드 갯수
		int command_Num = sc.nextInt();
		sc.nextLine();

		Stack<Integer> Mystack = new Stack<Integer>();
		int count = 0;

		while (count < command_Num) {
			String command = sc.nextLine();
			String[] commandArray = command.split(" ");
			if (commandArray[0].equals("push")) {
				Mystack.push(Integer.parseInt(commandArray[1]));
			} else {
				switch (command) {
				case "size":
					System.out.println(Mystack.size());
					break;
				case "empty":
					if (Mystack.empty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
					break;
				case "top":
					if (Mystack.empty()) {
						System.out.println("-1");
					} else {
						System.out.println(Mystack.peek());
					}
					break;
				case "pop":
					if (Mystack.empty()) {
						System.out.println("-1");
					} else {
						System.out.println(Mystack.pop());
					}
					break;
				default:
					break;
				}
			}
			count++;
		}
		sc.close();
	}
}
