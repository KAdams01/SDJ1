package order;

public class OrderLine {
private int amount;
private Product product;

public OrderLine(int amount, Product product) {
	this.amount=amount;
	this.product=product.copy();
}
public int getAmount() {
	return amount;
}
public Product getProduct() {
	return product;
}
public double getPrice() {
	return this.product.getPrice();
}
public boolean equals(OrderLine other) {
	if (!(other instanceof OrderLine))
		return false;
	else {
		OrderLine line = (OrderLine) other;
		return amount == line.amount 
				&& product.getName().equals(line.product.getName())
				&& product.getPrice()==line.product.getPrice();
	}
}
public OrderLine copy() {
	return new OrderLine(amount,product);
}
}
