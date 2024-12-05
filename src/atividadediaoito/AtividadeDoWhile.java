package atividadediaoito;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		//entrada
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		
			do{
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
				 
			if(numero > 0) {
				soma += numero ++;
			}
			while(numero != 0);
				
			System.out.println("A soma dos números positivos é: " + soma);
			}
			}
}
