import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st no: ");
		int a = sc.nextInt();
		System.out.println("Enter a 2nd no: ");
		int b = sc.nextInt();
		int res = a+b;
		System.out.println("Result= "+res);
		
	}
}
