
public class Thread1R implements Runnable{

	private  int limite;

	public Thread1R(int limite)
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
