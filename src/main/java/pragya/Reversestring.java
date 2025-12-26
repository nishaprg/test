package pragya;

public class Reversestring {

	public static void main(String[] args) {
		String test ="test automation";
		StringBuilder sb=new StringBuilder(test);
		String rev=sb.reverse().toString();
		System.out.println(rev);
	}

}
