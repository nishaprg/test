package pragya;

public class Reverseonly {

	public static void main(String[] args) {
		String s= "To reverse the string";
		StringBuilder st=new StringBuilder(s);
		
		String[] str=s.split(" ");
		
		st.reverse();
		
		for(int i=0;i<=str.length-1;i++) {
			StringBuilder sb=new StringBuilder(str[i]);
			//System.out.println(str[i]);
			StringBuilder rev=sb.reverse();
			sb.append(rev).append(" ");
			System.out.println(sb.toString());
		}
		
		

	}

}
