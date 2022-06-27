package br.edu.univas.structure;

import br.edu.univas.vo.Entity;

public class Tree {
	
	/*
	1. Seu programa deve montar uma árvore genérica de peças de um produto.
		a) O produto é a raiz.
		b) As peças e componentes (compostos) são nós internos.
		c) As folhas são peças simples.
	2. Funções para manipulação da árvore:
		a) Cadastro de um produto (raiz)
		b) Cadastro de componentes (sub-peças) do produto
		c) Busca dos componentes que são folhas
		d) Cálculo do custo total do produto.
	*/
	
	private Node root = new Node();
	
	public void registerProduct(String name) {
		root.setEntity(new Entity(name, 0.0f, 1));
		
	}
	
	public void registerComponent(String name, float price, int quantity) {
		//TODO Use path to properly add child Nodes
		
		root.getChildren().add(
				new Node(
						new Entity(name, price, quantity)));
		
		/*
		path = "1.1.1";
		
		if(path.isBlank()) {// add Component to Root
			root.getChildren().add(
					new Node(
							new Entity(name, price, quantity)));
		} else {// Use Path to Add Component as a Child of an existing Component
			
			for(String current : path.split(".")) {
				int guide = Integer.valueOf(current);
				
			}
			
		}
		*/
	}
	
	public void searchLeafComponents() {
		//TODO
		
	}
	
	public void calculateProductCost() {
		root.getEntity().setPrice(root.calculatePrice());
		
		System.out.println("Valor Total do Produto: ");
		System.out.println("R$ " + root.getEntity().getPrice());
	}
	
	public void print() {
		
		printPreOrder(root);
	}
	
	public void printPreOrder(Node root) {
		if(root.getChildren().size() == 0) {
			System.out.println(root.getEntity().getName() + " (R$" + root.calculatePrice() + ")");
		} else {
			System.out.println(root.getEntity().getName() + " (R$" + root.getEntity().getPrice() + ")");
			for(Node current : root.getChildren()) {
				printPreOrder(current);
			}
		}
	}
	
	// get set
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
}
