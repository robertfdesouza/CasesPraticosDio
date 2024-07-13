package candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LigarCandidatos {
	public static void main (String[] args) {
		String [] candidatos = {"Felipe", "Robert", "Lee Maxial", "Isabella", "Ronilson"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}

}
	static void entrandoEmContato(String Candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contanto Realizado com sucesso!");
			
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com: " + Candidato + " Na: " + tentativasRealizadas + " Tentativa");
		else
			System.out.println("Não conseguimos contato com: " + Candidato + ", número máximo de tentativas: " + tentativasRealizadas);
		
		
	}
	
	// método auxiliar ATENDER
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	
	static void imprimirCandidatos() {
		
		String [] candidatos = {"Felipe", "Robert", "Lee Maxial", "Isabella", "Ronilson"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length; indice ++) {
			System.out.println("O Candidato de nº: " + (indice +1) + " é: " + candidatos[indice]);
	}
		
		System.out.println("Forma abreviada de interação FOR EACH");
		for(String candidato: candidatos) {
			System.out.println("O Candidato selecionado foi: " + candidato);
			
		}
}
	
	static void analisarCandidato() {
		String [] candidatos = {"Felipe", "Robert", "Lee Maxial", "Isabella", "Ronilson", "Alex Artur", "Edvaldo",
				"José Ribamar", "Darbin","Carlos Roberto"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O Candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O Candidato: " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
			
			
		}
		
		
	}
	
	//Método sobre valores aleatórios
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	

	//Método criado
	
		static void analisarCandidato(double salarioPretendido) {
			double salarioBase = 2000.0;
			
			if(salarioBase > salarioPretendido) {
				System.out.println("Ligar para o candidato!");
		}else if(salarioBase == salarioPretendido)
			System.out.println("Ligar para o candidato com contra proposta");
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}

	}

}



