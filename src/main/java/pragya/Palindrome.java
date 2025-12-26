package pragya;

public class Palindrome {

	public static void main(String[] args) {
		String s="test";
		StringBuilder sb=new StringBuilder(s);
		String s1=sb.reverse().toString();
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not plaindrome");
		}

	}

}
