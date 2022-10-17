import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Càlcul de àrea: Rectangle | Triangle | Cercle");
		Scanner sc = new Scanner(System.in);
		String opcio = sc.next();
		
		if (opcio.charAt(0) == 'R' || opcio.charAt(0) == 'r') {
			System.out.println("Opció seleccionada: Rectangle");
			
			System.out.print("Introdueix costat 1: ");
			double costat1 = sc.nextDouble();
			
			System.out.print("Introdueix costat 2: ");
			double costat2 = sc.nextDouble();
			
			System.out.println("Resultat: " + (costat1 * costat2));
			
		}
		
		sc.close();
	}

}
