import java.util.Scanner;

public class v42 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		
		double radius = Input.nextDouble();
		String ord = Input.next();
		char c = Input.next().charAt(0);
		String in = Input.next();
		System.out.println(volume(radius));
		System.out.println(backa(in));
		System.out.println(räkna(ord, c));
		System.out.println(sprak(ord));
	}

	public static double volume(double radius) {
		radius = (4 * 3.14 * radius * radius * radius) / 3;
		return radius;
	}

	public static String backa(String in) {
		String str = "";
		
		for (int i = in.length() - 1; i >= 0; i--) {
			str += in.charAt(i);
		}
		return str;
	}
	public static int räkna(String ord, char c) {
		
		int antal = 0;
		
		for (int i = 0; i < ord.length(); i++) {
			
			if (ord.toLowerCase().charAt(i) == (c)) {
				antal = antal + 1;
			}
		}
		return antal;
	}

public static String sprak(String word) {
	String nytt = "";
	
	for (int i = 0; i < word.length(); i++) {
		switch (word.toLowerCase().charAt(i)) {
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'z':
		
	nytt += word.charAt(i) + "o" + word.charAt(i);
		}
		
		switch (word.toLowerCase().charAt(i)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
		case 'å':
		case 'ä':
		case 'ö':
		case ' ':
	nytt += word.charAt(i);
		}
		
		}
	return  nytt;
	}
}



	