package order;

import java.util.ArrayList;

public class Order {
ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
public Order() {
	
}
public void addProduct(int amount, Product product) {
	OrderLine temp = new OrderLine(amount, product);
	orderLines.add(temp);
}
public int getNumberOfOrderLines() {
	return orderLines.size();
}
public OrderLine getOrderLine(int index) {
	return orderLines.get(index);
}
public double getTotalPrice() {
	double totalPrice=0;
	for (int i=0; i<orderLines.size(); i++) {
		totalPrice+=orderLines.get(i).getPrice();
	}
	return totalPrice;
}
}
