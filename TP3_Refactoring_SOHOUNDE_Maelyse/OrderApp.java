public class OrderApp {
	public static void main(String[] args) {
		String firstCustomerName = "Alice";
		double firstUnitPrice = 10;
		int firstQuantity = 2;
		double firstTotal = firstUnitPrice * firstQuantity + firstUnitPrice * firstQuantity * 0.2;
		String secondCustomerName = "Bob";
		double secondUnitPrice = 15;
		int secondQuantity = 1;
		double secondTotal = secondUnitPrice * secondQuantity + secondUnitPrice * secondQuantity * 0.2;
		System.out.println("Client : " + firstCustomerName);
		System.out.println("Prix HT : " + firstUnitPrice);
		System.out.println("Quantité : " + firstQuantity);
		System.out.println("Total TTC : " + firstTotal);
		System.out.println("------------------------");
		System.out.println("Client : " + secondCustomerName);
		System.out.println("Prix HT : " + secondUnitPrice);
		System.out.println("Quantité : " + secondQuantity);
		System.out.println("Total TTC : " + secondTotal);
		System.out.println("------------------------");
		if (firstTotal + secondTotal > 30) {
			System.out.println("Réduction !");
		} else {
			if (firstTotal + secondTotal > 20) {
				System.out.println("Petite réduction !");
			} else {
				System.out.println("Pas de réduction.");
			}
		}
	}
}