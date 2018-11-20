
 
public class Thread_Program {
 
	boolean odd;
	int begin=0;
	int end = 100;
 
	public void Even() {
		 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (begin <= end) {
 
				while (odd) {
					try {
						System.out.println("Thread 2 : The number is " +"'"+ begin +"'");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				begin++;
				odd = true;
				notify();
 
			}
		}
	}
	
	public void Odd() {
		synchronized (this) {
			while (begin < end) {
 
				while (!odd) {
					try {
						System.out.println("Thread 1 : The number is "+"'" + begin+"'");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				begin++;
				odd = false;
				notify();
			}
		}
	}
 
	
 
	public static void main(String[] args) {
 
		Thread_Program oep = new Thread_Program();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.Even();
 
			}
		});
		Thread t2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.Odd();
 
			}
		});
 
		t1.start();
		t2.start();
 
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
}
 