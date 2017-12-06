package order;

public class Product {
private String name;
private double price;

public Product (String name, double price) {
	this.name=name;
	this.price=price;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;
}
public Product copy() {
	return new Product(name,price);
}
public String toString() {
	return "name: " + name + "\nPrice: " + price;
}
}
