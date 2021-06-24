import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 * 
 *         Ler a idade em anos, mês e dias. Em seguida mostrar idade somente em
 *         dias.
 */
public class Questao5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ano = 365;
		int mes = 30;

		System.out.print("ANOS DE IDADE: ");
		int idade = sc.nextInt();
		System.out.print("MESES: ");
		int meses = sc.nextInt();
		System.out.print("DIAS: ");
		int dias = sc.nextInt();

		double idadeEmDias = (idade * ano) + (meses * mes) + dias;
		System.out.println("IDADE EM DIAS: " + idadeEmDias);

		sc.close();
	}

}
