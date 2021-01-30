
public class Thread1 extends Thread {

	private  int limite;

	public Thread1(int limite)
	{
		this.limite = limite;
	}

	public void run() {
		try {
			for(int i = 2; i<=limite; i+=2)
			{
				System.out.println("T1: " + i);
			}
		}
		catch(Exception e) {}
	}

	
}
