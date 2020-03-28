
public class Rek_potenz {

	public static int erg = 1;

	public static void main(String[] args) {

		int x = 3;
		int y = 4;

		System.out.println("Ergebnis: " + potenz(x, y));

	}

	private static int potenz(int x, int y) {

		erg = erg * x;
		y--;
		if (y > 0) {
			potenz(x, y);
		}
		return erg;
	}

}
