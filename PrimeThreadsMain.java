package Assignment8_2;

public class PrimeThreadsMain {
	public static void main(String[] args) {
		PrimeThread pTh = new PrimeThread(29);
		PrimeThread pTh2 = new PrimeThread(16);
		
		PrimeIntThread pITh1 = new PrimeIntThread(29);
		PrimeIntThread pITh2 = new PrimeIntThread(16);
		
		Thread t1 = new Thread(pITh1);
		Thread t2 = new Thread(pITh2);
		
		
		
		System.out.println("Inherited Threads:");		
		pTh.start();

		synchronized(pTh){
			try {
				pTh.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pTh2.start();
		
		synchronized(pTh2){
			try {
				pTh2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Interface Threads:");
		t1.start();
		t2.start();
	}
}