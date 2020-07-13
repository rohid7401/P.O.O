
public class Cajero {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public Cajero(String name) {
		this.name = name;
	}
	
	public void analyzePurchase(Cliente cliente, long timeStamp) {
		
		long time = (System.currentTimeMillis() - timeStamp)/1000;
		System.out.println("El cajero "
				+ this.name
				+ " comienza a procesar la compra de "
				+ cliente.getName()
				+ " en el tiempo "
				+ time + "s");
		
		for (int i = 0; i < cliente.getShoppingCart().length; i++) {
			this.waitXseconds(1);
			time = (System.currentTimeMillis() - timeStamp)/1000;
			System.out.println("Procesando el producto " + i
					+ " código " + cliente.getShoppingCart()[i]
					+ " en el tiempo "
					+ time + "s");
		}

		time = (System.currentTimeMillis() - timeStamp)/1000;
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
