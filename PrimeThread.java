package Assignment8_2;

public class PrimeThread extends Thread {
	
	private int num;
	
	public PrimeThread(int num){
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
	