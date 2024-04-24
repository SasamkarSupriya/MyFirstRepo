class Hi extends Thread{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

class Hello extends Thread{
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JavaThread {

	public static void main(String[] args) {
		
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		
		obj.start();
		obj1.start();
		

	}

}
