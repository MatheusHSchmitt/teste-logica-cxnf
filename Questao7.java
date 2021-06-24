import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 * 
 *         Ler as notas, informar a média e dizer se foi aprovado ou reprovado.
 */
public class Questao7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("AVALIAÇÃO 1: ");
		double avaliacao1 = sc.nextDouble();
		System.out.print("AVALIAÇÃO 2: ");
		double avaliacao2 = sc.nextDouble();
		System.out.print("AVALIAÇÃO 3: ");
		double avaliacao3 = sc.nextDouble();

		double media = (avaliacao1 + avaliacao2 + avaliacao3) / 3;

		if (media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}

		System.out.printf("MÉDIA : %.1f", media);
		sc.close();

	}

}
