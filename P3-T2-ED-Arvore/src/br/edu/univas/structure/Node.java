package br.edu.univas.structure;

import java.util.ArrayList;

import br.edu.univas.vo.Entity;

public class Node {
	
	/*
	3. Cada pe�a/componente deve ter as seguintes informa��es
		a) Nome
		b) Valor unit�rio (este valor deve ser calculado nos n�s internos)
		c) Quantidade (de componentes para montar uma unidade do n� pai)
		d) Lista de componentes filhos, ou seja, as sub-pe�as.
	*/
	
	private Entity entity;
	private ArrayList<Node> children = new ArrayList<>();
	
	public Node() { }
	
	public Node(Entity entity) {
		this.entity = entity;
	}
	
	//
	
	public float calculatePrice() {
		
		if(children.isEmpty()) {
			return entity.getPrice();
		} else {
			
			float totalValue = entity.getPrice();
			
			for(Node current : children) {
				totalValue += current.calculatePrice();
			}
			
			return totalValue;
		}
	}
	
	// get set
	
	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
}
