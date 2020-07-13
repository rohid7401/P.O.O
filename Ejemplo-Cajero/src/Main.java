
public class Main {

	public static void main(String[] args) {
		
		/*
		Cliente cliente = new Cliente("Rohi");
		Cajero cajero = new Cajero("Daniel");
		long initialTime = System.currentTimeMillis();
		cajero.analyzePurchase(cliente, initialTime);
		System.out.println("-----------------------");
		*/
		
		Cliente cliente = new Cliente("Rohi");
		Cliente cliente2 = new Cliente("Daniel");
		long tiempoInicial = System.currentTimeMillis();
		
		CajeroThread cajerothread = new CajeroThread("Cajero1", cliente, tiempoInicial);
		CajeroThread cajerothread2 = new CajeroThread("Cajero2", cliente2, tiempoInicial);
		
		cajerothread.start();
		cajerothread2.start();
	}
	
}
