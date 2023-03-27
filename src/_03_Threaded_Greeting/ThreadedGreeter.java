package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
    int num = 0;
	@Override
	public void run() {
		System.out.println("Hello from thread number "+num+"!");
		if(num<=50) {
			Thread t = new Thread(new ThreadedGreeter(num+1));
			t.start();
			try {
				t.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//3. In the run method of the ThreadedGreeter class, print the message using the member variable as the thread number.
	//   If the member integer is less than or equal to 50, create a new thread. 
	//   Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
	public ThreadedGreeter(int num){
		this.num = num;
	}

}
