import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introdueix un valor: ");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		
		if ((valor % 10) == 0) {
			System.out.print("És múltiple de 10");
		} else {
			System.out.print("No és múltiple de 10");
		}
		
	}

}
