import java.util.Scanner;

public class Läxa1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("vad heter du");

		String namn = input.nextLine();

		System.out.println("hur gammal ar du ?");
		String age = input.nextLine();
		System.out.println("vad ar din adress?");
		String adress = input.nextLine();

		System.out.println("postnummer?");
		String postnummer = input.nextLine();

		System.out.println("Ort?");
		String ort = input.nextLine();

		System.out.println("Telefonnummer?");
		String telefonnummer = input.nextLine();
		System.out.println("vad heter du"+ namn);
		
		System.out.println("hur gammal ar du ?"+" "+age);
		System.out.println("vad ar din adress?"+" "+adress);
		System.out.println("\t"+postnummer+" "+ort);
		System.out.println("Telefonnummer"+" "+telefonnummer);
		
	}

}
