package Israel;

/**
 * La clase RestauranteIsrael gestiona los comensales del restaurante Israel
 * 
 * @author Sara Camis�n
 * @version 1.0
 */

public class RestauranteIsrael {
	/** Representa el n�mero de patatas */
	public int p;
	/** Representa el n�mero de calamares */
	public int c;

	/**
	 * Contructor de la clase RestauranteIsrael
	 * 
	 * @param a Indica el n�mero de patatas que hay en el stock
	 * @param b Indica el n�mero de calamares que hay en el stock
	 */
	public RestauranteIsrael(int a, int b) {
		this.p = a;
		this.c = b;
	}

	/**
	 * M�todo por el que se conoce el n�mero m�ximo de comensales en funci�n del
	 * n�mero de patatas en stock
	 * 
	 * @return Devuelve el n�mero de comensales
	 */
	int cantP() {
		int a = this.p * 3;
		return a;
	}
	/**
	 * M�todo por el que se conoce el n�mero m�ximo de comensales en funci�n del
	 * n�mero de calamares en stock
	 * 
	 * @return Devuelve el n�mero de comensales
	 */
	int cantC() {
		int ch = this.c * 6;
		return ch;
	}

	/**
	 * M�todo por el que se a�ade la cantidad de calamares recibidos en un pedido
	 * 
	 * @param c cantidad de calamares a a�adir al stock
	 */
	public void addCalamares(int c) {
		this.c = this.c + c;
	}

	/**
	 * M�todo por el que se a�ade la cantidad de patatas recibidos en un pedido
	 * 
	 * @param d cantidad de patatas a a�adir al stock
	 */
	public void addPatatas(int d) {
		this.p = this.p + d;
	}

	/** @hidden */
	public static void main(String[] args) {
		RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + r1.c);
		System.out.println("Cantidad de patatas: " + r1.p);
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas m�ximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares m�ximo");
		}
		r1.addCalamares(1);
		r1.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(r1.p + " patatas.\n" + r1.c + " calamares");
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas m�ximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares m�ximo");
		}
	}
}