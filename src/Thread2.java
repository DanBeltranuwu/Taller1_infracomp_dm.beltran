
public class Thread2 extends Thread {

	private int limite;

	public Thread2(int limite)
	{
		this.limite = limite;
	}

	public void run() {
		try {
			for(int i = 1; i<=limite; i+=2)
			{
				System.out.println("T2: " + i);
			}
		}
		catch(Exception e) {}
	}
}
