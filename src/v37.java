import java.util.Scanner;

public class v37 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in 10 tal");

		// L�s in tal1
		int tal1 = input.nextInt();
		int min = tal1;
		int max = tal1;

		// L�s in tal 2
		int tal2 = input.nextInt();
		if (tal2 > max) {
			max = tal2;
		}

		// L�s in tal3
		int tal3 = input.nextInt();
		if (tal3 > max) {
			max = tal3;
		}
		// L�s in tal4
		int tal4 = input.nextInt();
		if (tal4 > max) {
			max = tal4;
		}
		// L�s in tal5
		int tal5 = input.nextInt();
		if (tal5 > max) {
			max = tal5;

		}
		// L�s in tal6
		int tal6 = input.nextInt();
		if (tal6 > max) {
			max = tal6;
		}
		// L�s in tal7
		int tal7 = input.nextInt();
		if (tal7 > max) {
			max = tal7;
		}
		// L�s in tal8
		int tal8 = input.nextInt();
		if (tal8 > max) {
			max = tal8;
		}
		// L�s in tal9
		int tal9 = input.nextInt();
		if (tal9 > max) {
			max = tal9;
		}
		// L�s in tal10
		int tal10 = input.nextInt();
		if (tal10 > max) {
			max = tal10;
			System.out.println("Minsta talet" + min);
			System.out.println("St�rsta talet" + max);
			int summa = (tal1 + tal2 + tal3 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10) / 10;
			System.out.println("Medelv�rdet" + summa);
		}

	}

}
