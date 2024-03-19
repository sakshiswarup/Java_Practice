package thread_example;

public class T1 implements Runnable {
	String name;
	T1(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i<10000;i++) {
			System.out.println("run");
		}
		}
	//three threads here
		public static void main(String[] args) {
			T1 t1=new T1("xxx");
			Thread th1 = new Thread(t1);
			th1.start();
			T1 t2 = new T1("yyy");
			Thread th2 = new Thread(t2);
			th2.start();
			for(int i = 0; i<10000;i++) {
				System.out.println("main");
			}
		}
	}

	

