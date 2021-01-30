
public class Thread2R implements Runnable{
	
	private int limite;

	public Thread2R(int limite)
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
