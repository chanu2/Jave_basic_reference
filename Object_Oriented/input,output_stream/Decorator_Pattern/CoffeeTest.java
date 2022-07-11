package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		 Coffee etiopiaCoffee = new EtiopiaAmericano();
		 etiopiaCoffee.brewing();
		 
		 System.out.println();
		 
		 Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		 etiopiaLatte.brewing();
		 
		 System.out.println();
		  
		 Coffee etiopiaMocka = new Mocka(new Latte(new EtiopiaAmericano()));
		 etiopiaMocka.brewing();
		 
		 System.out.println();
		 
		 Coffee keyaAmericano = new WhippingCream (new Mocka(new Latte(new KeyaAmericano())));
		 keyaAmericano.brewing();
	}

}
