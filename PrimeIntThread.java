package Assignment8_2;

public class PrimeIntThread implements Runnable {
	
	private int num;
	
	public PrimeIntThread(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isPrime;
		synchronized (this) {
			isPrime = true;
			;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		notify();
		}
		
		System.out.println(isPrime ? ("The Number is Prime!"):("The Number is not Prime!"));
	}

}