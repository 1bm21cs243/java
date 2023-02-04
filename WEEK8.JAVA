class BmsThread extends Thread {
	public void run()
	{
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println("BMS College of Engineering");
			Thread.sleep(10000);
		}
		}
		catch(InterruptedException e ) {
			System.out.println("BmsThread Interrupted");
		}
	}
}

class CsThread extends Thread {
	public void run() {
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println("CSE");
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e ) {
			System.out.println("CsThread Interrupted");
		}
	}
}

class program8{
	public static void main(String args[]) {
		new BmsThread().start();
		new CsThread().start();
	}
}
