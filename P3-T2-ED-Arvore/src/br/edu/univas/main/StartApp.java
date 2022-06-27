package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.structure.Tree;

public class StartApp {
	
	/*
	1. Seu programa deve montar uma �rvore gen�rica de pe�as de um produto.
		a) O produto � a raiz.
		b) As pe�as e componentes (compostos) s�o n�s internos.
		c) As folhas s�o pe�as simples.
	2. Fun��es para manipula��o da �rvore:
		a) Cadastro de um produto (raiz)
		b) Cadastro de componentes (sub-pe�as) do produto
		c) Busca dos componentes que s�o folhas
		d) C�lculo do custo total do produto.
	3. Cada pe�a/componente deve ter as seguintes informa��es
		a) Nome
		b) Valor unit�rio (este valor deve ser calculado nos n�s internos)
		c) Quantidade (de componentes para montar uma unidade do n� pai)
		d) Lista de componentes filhos, ou seja, as sub-pe�as.
	4. Ao iniciar, o programa deve ler as informa��es do teclado e montar uma �rvore
	contendo todos as componentes.
	5. Ao final, o programa deve:
		a) Imprimir custo total do produto.
		b) Imprimir uma lista com todos os componentes �folha�.
	6. N�o � permitido usar classes do Java para manipula��o de �rvores.
	7. � permitido usar classes de listas, filas e pilhas do Java.
	8. Anotar no arquivo Readme.md as suas decis�es n�o especificadas nesta descri��o.
	9. Utilizar no m�nimo 3 n�veis e no m�ximo 5 n�veis na �rvore
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tree tree = new Tree();
		String line = "";
		
		tree.registerProduct("Produto");
		
		do {
			line = readString(scan);
			
			if(!line.isBlank()) {
				tree.registerComponent(line, readFloat(scan), readInt(scan));
			}
			
			
		} while(!line.isBlank());
		
		//
		
		tree.print();
		
		scan.close();
	}
	
	/*
	public void imprimir() {
		imprimirPreOrdem(raiz, "$");
		//imprimirEmOrdem(raiz);
	}
	
	private void imprimirPreOrdem(No raizDaSubArvore, String cenario) {
		//System.out.println("Cenario: " + cenario);
		if(raizDaSubArvore == null) {
			return;
		}
		System.out.println(cenario + " : " + raizDaSubArvore.entidade.nome);
		imprimirPreOrdem(raizDaSubArvore.esquerda, cenario + "<"); 
		imprimirPreOrdem(raizDaSubArvore.direita, cenario + ">");
	}
	*/
	
	// misc 
	
	static String readString(Scanner scan) {
		System.out.println("Digite uma String: (abc)");
		return scan.nextLine();
	}
	
	static float readFloat(Scanner scan) {
		System.out.println("Digite um N�mero Float: (12,34)");
		float num = scan.nextFloat();
		//scan.nextLine();
		return num;
	}
	
	static int readInt(Scanner scan) {
		System.out.println("Digite um N�mero Inteiro: (1234)");
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
}
