package AnnonymouseInnerClasss;

public class AnonymouseInnerClassWithThread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<5;i++) {
					System.out.println("AnonymouseInnerClassWithThread.main(...).new Thread() {...}.run()");
				}
			}
		};
		t1.start();
	}
}
