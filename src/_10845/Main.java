package _10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	//명령은 총 여섯 가지이다.
	//•push X: 정수 X를 큐에 넣는 연산이다.
	//•pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	//•size: 큐에 들어있는 정수의 개수를 출력한다.
	//•empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	//•front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	//•back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int command_Num = sc.nextInt();
		sc.nextLine();
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int a = 0;
		int last=0;
		while (a < command_Num) {
			String command = sc.nextLine();
			String[] commandArray = command.split(" ");

			if (commandArray[0].equals("push")) {
				myQueue.add(Integer.parseInt(commandArray[1]));
				last = Integer.parseInt(commandArray[1]);
			}
			else if(command.equals("pop")) {
				if (myQueue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(myQueue.poll());
				}
			}
			else if (command.equals("size")) {
				System.out.println(myQueue.size());
			}
			else if (command.equals("empty")) {
				if (myQueue.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
			else if (command.equals("front")) {
				if (myQueue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(myQueue.peek());
				}
			}
			else if (command.equals("back")) {
				if (myQueue.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(last);
				}
			}
			

			a++;
		}
	}
}