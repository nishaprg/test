package pragya;

public class Subbank extends Axis{

	public static void main(String[] args) {
		Subbank sb=new Subbank();
		sb.test4();

	}
	public void test4() {
		System.out.println("testsubclass method");
		debit();
		credit();
		homeloan();
		
	}

}
