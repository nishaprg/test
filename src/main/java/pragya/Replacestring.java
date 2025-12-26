package pragya;

public class Replacestring {

	public static void main(String[] args) {
		String s="Automation test 12134 #$#$&#^$&*";
		
		String t=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(t);
		
		String n=s.replaceAll("[0-9]", "");
		System.out.println(n);
		
		String c=s.replaceAll("[^a-zA-Z ]", "");
		System.out.println(c);
		
		String p=s.replaceAll("[^0-9]", "");
		System.out.println(p);
		
		String a=s.replaceAll("[a-zA-z ]", "");
		System.out.println(a);
		

	}

}
