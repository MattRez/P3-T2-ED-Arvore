package br.edu.univas.vo;

public class Entity {
	
	/*
	3. Cada peça/componente deve ter as seguintes informações
		a) Nome
		b) Valor unitário (este valor deve ser calculado nos nós internos)
		c) Quantidade (de componentes para montar uma unidade do nó pai)
		d) Lista de componentes filhos, ou seja, as sub-peças.
	*/
	
	private String name;
	private float price;
	private int quantity;
	
	public Entity() {}
	
	public Entity(String name, float price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
