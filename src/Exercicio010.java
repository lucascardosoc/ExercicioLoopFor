import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome, setor;
		int meioDeTransporte, placa;
		
		for(int i=1; i<=150; i++) {
			System.out.println("Por favor digite o nome do " + i + " � funcion�rio");
			nome = leitor.nextLine();
			System.out.println("Por favor digite o setor do " + i + " � funcion�rio");
			setor = leitor.nextLine();
			
			System.out.println("Por favor digite 1 se o meio de transporte for CARRO, ou digite 2 se o meio de transporte for �NIBUS");
			meioDeTransporte = leitor.nextInt();
			
			if (meioDeTransporte == 1) {
				System.out.println("Por favor, informe o �ltimo digito da placa do funcion�rio");
				placa = leitor.nextInt();
				
				switch(placa) {
				case 1:
				case 2: 
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", seu dia de rod�zio � na segunda-feira");
					break;
					
				case 3:
				case 4:
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", seu dia de rod�zio � na ter�a-feira");
					break;
					
				case 5:
				case 6:
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", seu dia de rod�zio � na quarta-feira");
					break;
					
				case 7:
				case 8: 
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", seu dia de rod�zio � na quinta-feira");
					break;
					
				case 9:
				case 0:
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", seu dia de rod�zio � na sexta-feira");
					break; 
			} 
			} else {
				if (meioDeTransporte==2) {
					System.out.println("Aten��o, " + nome + " do setor " + setor + ", o rod�zio mun�cipal n�o se aplica ao transporte p�blico");
				} else {
				System.out.println("Meio de transporte inv�lido");
			}
			
			}
		}
	leitor.close();	
	}
}


