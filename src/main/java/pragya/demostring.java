package pragya;

public class demostring {
	

    public static void main(String[] args) {
        String s = "test automation";
        StringBuilder sb=new StringBuilder();
       String[] str= s.split(" ");
        for(int i=str.length-1;i>=0;i--) {
     sb.append(str[i]).append(" ");
      
    }
        System.out.println(sb.toString().trim());
        }
}
