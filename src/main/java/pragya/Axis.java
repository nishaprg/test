// This is a sample comment added for demonstration purposes.
package pragya;

public class Axis implements RBI {

	public static void main(String[] args) {
		Axis a=new Axis();
		a.debit();
		a.homeloan();
		a.credit();

	}
	public void credit() {
		System.out.println("credi percent is 15%");
	}
	public void debit() {
		System.out.println("test debit");
	}
	public void homeloan() {
		System.out.println("Test homeloan");
		
		
	}

}