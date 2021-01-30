import java.util.Scanner;

public class principal {
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese que version quiere ver:");
		System.out.println("1. Version basada en la clase Thread");
		System.out.println("2. Version basada en la interfaz Runnable");
		String opcion = entrada.next();
		System.out.println("Ingrese el valor límite:");
		int limite1 = Integer.parseInt(entrada.next());
		if(opcion.equals("1"))
		{
			Thread1 t0 = new Thread1(limite1);
			Thread2 t1 = new Thread2(limite1);
			
			t0.start();
			t1.start();
		}
		else
		{
			Thread t0 = new Thread(new Thread1R(limite1));
			Thread t1 = new Thread(new Thread2R(limite1));
			
			t0.start();
			t1.start();
		}
	}
}
