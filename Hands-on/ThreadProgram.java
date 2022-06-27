package Corejava;

class ThreadProgram implements Runnable
{
	public void run()
	{ 
	//variable	
	int i;
	//for loop
	for(i=1; i<=10;i++) {	
		System.out.println("Good Morning !!");
		//try catch block
		try {
			//sleep method
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome !!");
	}
	}
	public static void main(String[] args)
	{
		// Runnable interface
		Runnable r1 = new ThreadProgram();
		Thread t1 = new Thread();
		// Thread object started
		t1.start();
		r1.run();		
		// getting the Thread
		// with String Method
		String str = t1.getName();
		System.out.println(str);
	}
}

