import java.util.Scanner;

public class Alecu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idjo");
		char start = sc.next().charAt(0);
		
		while (start != 'n') {
			
			if (start == 'y') {
				
				/*
				 
				Aqui tu faz todo o seu teste.
				 
				*/
				
			} else {
				System.out.println("Caracter inválido!");
			}
			
			System.out.println("Idjo");
			start = sc.next().charAt(0);
		}
		
		sc.close();
	}

}
