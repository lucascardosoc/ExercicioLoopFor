import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome, setor;
		int meioDeTransporte, placa;
		
		for(int i=1; i<=150; i++) {
			System.out.println("Por favor digite o nome do " + i + " º funcionário");
			nome = leitor.nextLine();
			System.out.println("Por favor digite o setor do " + i + " º funcionário");
			setor = leitor.nextLine();
			
			System.out.println("Por favor digite 1 se o meio de transporte for CARRO, ou digite 2 se o meio de transporte for ÔNIBUS");
			meioDeTransporte = leitor.nextInt();
			
			if (meioDeTransporte == 1) {
				System.out.println("Por favor, informe o último digito da placa do funcionário");
				placa = leitor.nextInt();
				
				switch(placa) {
				case 1:
				case 2: 
					System.out.println("Atenção, " + nome + " do setor " + setor + ", seu dia de rodízio é na segunda-feira");
					break;
					
				case 3:
				case 4:
					System.out.println("Atenção, " + nome + " do setor " + setor + ", seu dia de rodízio é na terça-feira");
					break;
					
				case 5:
				case 6:
					System.out.println("Atenção, " + nome + " do setor " + setor + ", seu dia de rodízio é na quarta-feira");
					break;
					
				case 7:
				case 8: 
					System.out.println("Atenção, " + nome + " do setor " + setor + ", seu dia de rodízio é na quinta-feira");
					break;
					
				case 9:
				case 0:
					System.out.println("Atenção, " + nome + " do setor " + setor + ", seu dia de rodízio é na sexta-feira");
					break; 
			} 
			} else {
				if (meioDeTransporte==2) {
					System.out.println("Atenção, " + nome + " do setor " + setor + ", o rodízio munícipal não se aplica ao transporte público");
				} else {
				System.out.println("Meio de transporte inválido");
			}
			
			}
		}
	leitor.close();	
	}
}


