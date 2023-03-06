package bar;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill bill = new Bill();

		System.out.printf("Sexo: ");
		bill.setGender(sc.nextLine().charAt(0));

		System.out.printf("Quantidade de cervejas: ");
		bill.setBeer(sc.nextInt());

		System.out.printf("Quantidade de refrigerantes: ");
		bill.setSoftDrink(sc.nextInt());

		System.out.printf("Quantidade de espetinhos: ");
		bill.setBarbecue(sc.nextInt());

		System.out.printf("%n%nRELATÓRIO: ");
		System.out.printf("%nConsumo = R$%.2f ", bill.feeding());

		if (bill.cover() == 0.00) {
			System.out.printf("%nIsento de Couvert");
		} else {
			System.out.printf("%nCouvert = R$%.2f ", bill.cover());
		}

		System.out.printf("%nIngresso = R$%.2f ", bill.ticket());

		System.out.printf("%n%nValor a pagar = R$%.2f", bill.total());

	}
}
