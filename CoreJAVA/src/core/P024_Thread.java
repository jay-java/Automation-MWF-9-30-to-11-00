package core;

public class P024_Thread {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread());
		// MAX - 10
		// NORM - 5
		// MIN - 1
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t + " : " + i);
			Thread.sleep(2000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
