
public class CajeroThread extends Thread{
	
	private String name;
	private Cliente cliente;
	private long initialTime;
	
	public CajeroThread(String name, Cliente cliente, long initialTime) {
		super();
		this.name = name;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	public String getNombre() {
		return name;
	}

	@Override
	public void run() {
		long time = (System.currentTimeMillis() - this.initialTime)/1000;
		System.out.println("El cajero "
				+ this.name
				+ " comienza a procesar la compra de "
				+ cliente.getName()
				+ " en el tiempo "
				+ time + "s");
		
		for (int i = 0; i < cliente.getShoppingCart().length; i++) {
			this.waitXseconds(1);
			time = (System.currentTimeMillis() - this.initialTime)/1000;
			System.out.println(this.name
					+ " esta procesando el producto " + i
					+ " código " + cliente.getShoppingCart()[i]
					+ " en el tiempo "
					+ time + "s");
		}

		time = (System.currentTimeMillis() - this.initialTime)/1000;
		System.out.println("El cajero " 
				+ this.name
				+ " terminó de procesar la compra de "
				+ cliente.getName()
				+ " en el tiempo "
				+ time + "s");

	}
	
	private void waitXseconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
