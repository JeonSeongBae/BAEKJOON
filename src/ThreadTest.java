public class ThreadTest extends Thread {
	int id;
	public static int index = 0;

	public ThreadTest(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(id);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			ThreadTest t1 = new ThreadTest(i);
			t1.start();
//			t1.join();
		}
		System.out.println(index + "!!!");

//		ThreadTest t1 = new ThreadTest(1);
//		t1.start();
//		t1.join();
//		ThreadTest t2 = new ThreadTest(2);
//		t2.start();

	}

}
