import java.util.Scanner;

/**
 * 
 */

/**
 * @author Fran Garrido
 *
 */

	public static void pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	public static int cuantos_impares(int v[]) {
		int contador = 0;
		
		for(int i = 0; i < v.leng; i++) {
			if (v[i] % 2 != 0) {
				contador++;
			}
		}
		return contador;
	}
	
public class Ejericicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuantos elementos quieres? ");
		int tam = entrada.nextInt();
		
		pedirVector()

	}

}
