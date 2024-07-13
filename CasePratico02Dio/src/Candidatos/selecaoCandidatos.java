package Candidatos;

import java.util.concurrent.ThreadLocalRandom;


public class selecaoCandidatos {
	public static void main(String[] args) {
		analisarCandidato();
		
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

