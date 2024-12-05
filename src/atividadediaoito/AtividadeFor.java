package atividadediaoito;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroinicial;
		int numerofinal;
		int contador;
		

		
		System.out.println("Digite o menor número: ");
		numeroinicial = leia.nextInt();
		System.out.println("Digite o maior número: ");
		numerofinal = leia.nextInt();
		
		
		if(numeroinicial < numerofinal) {
			for(contador = numeroinicial; contador <= numerofinal; contador ++) {
			if(contador%5 == 0 && contador%3 == 0) {
					System.out.println(contador + " é multiplo de 5 e 3.");
		}
		
	
			
		}
			}
		else {
			System.out.println("Intervalo inválido");
				
			}
	}
}

		
		
	
	


