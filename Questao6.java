import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Matheus Schmitt
 * 
 *         Ler o número total de votos de um município, os brancos, nulos, e
 *         validos. Em seguida mostrar o percentual que cada um representa.
 */
public class Questao6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("TOTAL DE ELEITORES: ");
		double totalDeEleitores = sc.nextDouble();
		System.out.print("VOTOS BRANCOS: ");
		double brancos = sc.nextDouble();
		System.out.print("VOTOS NULOS: ");
		double nulos = sc.nextDouble();
		double validos = totalDeEleitores - brancos - nulos;
		System.out.println("VOTOS VALIDOS: " + validos);
		System.out.println();
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("VOTOS BRANCOS: " + formato.format((brancos * 100) / totalDeEleitores) + "%");
		System.out.println("VOTOS NULOS: " + formato.format((nulos * 100) / totalDeEleitores) + "%");
		System.out.println("VOTOS VALIDOS: " + formato.format((validos * 100) / totalDeEleitores) + "%");
		sc.close();

	}

}
