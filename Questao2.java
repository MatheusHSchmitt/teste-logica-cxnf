import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 * 
 *         Mostrar o antecessor de um determinado valor.
 */
public class Questao2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE UM NÚMERO: ");
		int x = sc.nextInt();

		System.out.println("ANTECESSOR = " + (x - 1));

		sc.close();
	}

}
