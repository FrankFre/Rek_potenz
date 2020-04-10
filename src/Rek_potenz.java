
public class Rek_potenz {

	public static int erg = 1;

	public static void main(String[] args) {

		int x = 4;
		int y = 5;

		System.out.println("Ergebnis: " +  x + " hoch " + y + ' ' + potenz(x, y));

	}
 
	private static int potenz(int x, int y) {

		erg = erg * x;
		y--;
		if (y > 0) {
			potenz(x, y); //Rekursion
		}
		return erg;
	}

}
