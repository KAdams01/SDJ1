package order;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		Product toy = new Product("car",15);
		Product toy2 = new Product("train",15);
		Product toy3 = new Product("bus",15);
		OrderLine ol1 = new OrderLine(10,toy);
		System.out.println(toy);
		System.out.println(ol1.getProduct());
		order1.addProduct(10, toy);
		order1.addProduct(10, toy2);
		order1.addProduct(10, toy3);
		System.out.println(order1.getNumberOfOrderLines());
		System.out.println(order1.getTotalPrice());
		

	}

}
