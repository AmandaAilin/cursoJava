package entities;

public class ProductEncapsulamento {
	private String name;
	private double price;
	private int quantity;

	public ProductEncapsulamento() {
	}

	public ProductEncapsulamento(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	}

	public ProductEncapsulamento(String name, double price) {
	this.name = name;
	this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;

	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;    //usamos o this para acessar o atributo da classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //toString - converte o objeto para string
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
