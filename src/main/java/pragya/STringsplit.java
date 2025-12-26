package pragya;

public class STringsplit {

	public static void main(String[] args) {
//		String s="Auto mation";
//		String[] a=s.split(" ");
//		System.out.println(a[1]);
//		System.out.println(a[0]);
		String t="Auto_mation";
		String[] a= t.split("_");
		
		int l=a.length;
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			System.out.println(a[i]);
		}
				

	}

}
