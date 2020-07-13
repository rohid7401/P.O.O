import java.util.Random;

public class Cliente {
	
	private final int MIN_Size_ShoppingCart = 10;
	private final int AUX_Size_ShoppingCart= 5;
	private final int MAX_ITEM_CODE = 100;
	
	private String name;
	private int[] shoppingCart;

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int[] getShoppingCart() {
		return shoppingCart;
	}
	

	public Cliente(String name) {
		this.name = name;
		
		Random r= new Random();
		int sizeShoppingCart = MIN_Size_ShoppingCart + r.nextInt(AUX_Size_ShoppingCart) + 1;
		
		shoppingCart = new int[sizeShoppingCart];
		
		for (int i = 0; i < shoppingCart.length; i++) {
			shoppingCart[i] = r.nextInt(MAX_ITEM_CODE + 1);
			//System.out.println(shoppingCart[i]);
		}
		
	}	
		
}
