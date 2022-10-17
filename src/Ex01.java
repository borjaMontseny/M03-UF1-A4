import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Dia1: ");
		Scanner sc = new Scanner(System.in);
		int dia1 = sc.nextInt();
		
		System.out.print("Mes1: ");
		int mes1 = sc.nextInt();
		
		System.out.print("Any1: ");
		int any1 = sc.nextInt();
		
		System.out.print("Dia2: ");
		int dia2 = sc.nextInt();
		
		System.out.print("Mes2: ");
		int mes2 = sc.nextInt();
		
		System.out.print("Any2: ");
		int any2 = sc.nextInt();
		sc.close();
		
		if (any1 > any2) {
			if (mes1 > mes2) {
				if (dia1 > dia2) {
					System.out.print("Data 1 es anterior a Data 2");
				}
			}
		} else if (any1 == any2) {
			if (mes1 > mes2) {
				if (dia1 > dia2) {
					System.out.print("Data 1 és anterior a Data2 ");
				}
			}
		}
		
		
	}

}
