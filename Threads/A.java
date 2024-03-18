package thread_example;

//Thread-multitasking done at the program level purpose is called as threads.
//the main thread is improved the performance of the application by reducing excecution time
public class A extends Thread {// two methods present in threads-> run(),start()
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("run");
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main");
		}
	}
}


//creating multithreads. 
public class A extends Thread {
	
	String name;
	A(String name){
		this.name = name;
	}
@Override
	public void run() {
		for(int i = 0; i<10000; i++) {
			System.out.println(this.name);
		}
	}
	}
//one more part in B.java
