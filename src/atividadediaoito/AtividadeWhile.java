package atividadediaoito;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int idademaior = 0;
		int idademenor = 0;
      
		while (idade >= 0) {
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		if(idade < 21) {
			idademenor = idademenor + 1; 
		}
		if(idade > 50) {
			idademaior = idademaior + 1;
		}
			
		}
		System.out.println("Total de pessoas maiores de 50 anos: " + idademaior);
		System.out.println("Total de pessoas menores de 21 anos: " + idademenor);
		}
		
		
		}

		
			
			
		
	

