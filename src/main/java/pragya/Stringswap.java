package pragya;

public class Stringswap {
	public static void main(String[] args) {
	String a="test";
	String b="pragya";
	a=a+b;
	System.out.println(a);
	b=a.substring(0, a.length()-b.length());
	System.out.println(b);
	a=a.substring(b.length());
	System.out.println("a is"+" "+a);
	
	System.out.println("b is"+" " + b);
	}
}
