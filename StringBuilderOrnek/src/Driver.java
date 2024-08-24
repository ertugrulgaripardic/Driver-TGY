import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println(userInput.toLowerCase());
		StringBuffer buffer = new StringBuffer();
		System.out.print("Adınız: ");

		buffer.append(scanner.nextLine());
		System.out.print("Soyadınız: ");
		buffer.append(" ");
		buffer.append(scanner.nextLine());
		
		
		System.out.println("Adınız;" + buffer.toString());
	}
}