import java.util.Scanner;
public class SumaNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce otro número");
		int numero2 = Integer.parseInt(scan.nextLine());
		
		int suma = numero1 + numero2;
		System.out.println("La suma vale: " + suma);	
	}

}
