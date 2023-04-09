//Leer 5 enteros y sumarlos
import java.util.Scanner;
public class main {

	/*	CODIGO SIN OPTIMIZAR
	 * public static void main(String[] args) {
		
		Scanner scannerNumero1 = new Scanner(System.in);
		Scanner scannerNumero2 = new Scanner(System.in);
		Scanner scannerNumero3 = new Scanner(System.in);
		Scanner scannerNumero4 = new Scanner(System.in);
		Scanner scannerNumero5 = new Scanner(System.in);
		
		int enteroNumero1 = scannerNumero1.nextInt();
		int enteroNumero2 = scannerNumero1.nextInt();
		int enteroNumero3 = scannerNumero1.nextInt();
		int enteroNumero4 = scannerNumero1.nextInt();
		int enteroNumero5 = scannerNumero1.nextInt();
		
		int suma = enteroNumero1 + enteroNumero2 + enteroNumero3 + enteroNumero4 + enteroNumero5;
		
		System.out.println(suma);
		
	}*/
	
	/* CODIGO OPTIMIZADO
	 * public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int suma = 0;
		for(int i = 0; i < 5; i++) {
			suma += scan.nextInt();
		}
		System.out.println(suma);
	}*/
	
}
