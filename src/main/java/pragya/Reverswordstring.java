package pragya;

public class Reverswordstring {

	public static void main(String[] args) {
		
		Reverswordstring r=new Reverswordstring();
		r.method1();
		r.method2();
		
		
	}
	public void method1() {
		String s = "test automation selenium playwright";

		String[] arr = s.split(" ");
		int l = arr.length;
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i <= l - 1; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			String rev = sb.reverse().toString();
			sb1.append(rev).append(" ").toString();
		}
			System.out.println(sb1.toString());
		}
	//using only one string bulilder using print keywrod only
	public void method2() {
		String t="automation_selenium_test_playwright";
		String [] str=t.split("_");
		int len=str.length;
		for(int i=0;i<=len-1;i++) {
			StringBuilder sb2=new StringBuilder(str[i]);
			sb2.reverse();
			System.out.print(sb2);
			System.out.print(" ");
		}
	}

}
