import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 * 
 *         Mostrar se o n�mero digitado � maior ou menor que 10.
 */
public class Questao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE UM NUMERO: ");
		double x = sc.nextDouble();

		if (x > 10) {
			System.out.println("� MAIOR QUE 10!");
		} else {
			System.out.println("N�O � MAIOR QUE 10!");
		}
		sc.close();
	}

}
