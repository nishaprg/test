package pragya;

public class Stringreverse {

	public static void main(String[] args) {
		String s="pragya";
		String rev="";
		int i=s.length();
		System.out.println(i);
		
		for(int c=i-1;c>=0;c--) {
			rev=rev+s.charAt(c);
		}
		System.out.println(rev);
	}

}
