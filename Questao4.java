import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 *
 *         Ler o salário, o percentual de reajuste e mostrar salario atualizado.
 */
public class Questao4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("SALARIO ATUAL: R$");
		double salario = sc.nextDouble();
		System.out.print("REAJUSTE EM '%': ");
		double porcentagem = sc.nextDouble() / 100;

		double reajuste = salario * porcentagem;

		System.out.printf("SALARIO ATUAL : R$ %.2f%n", reajuste + salario);

		sc.close();
	}

}
