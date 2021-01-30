
public class contadorthread extends Thread {
	private static int contador = 0;
	
	public void run() {
		for(int i =0; i<10000; i++)
		{
			contador++;
		}
	}
	
	
	public static void main(String[] args) {
		contadorthread[] t = new contadorthread[1000];
		for(int i = 0; i<t.length; i++)
		{
			t[i]=new contadorthread();
			t[i].start();
		}
		System.out.println(contador);
	}
}
