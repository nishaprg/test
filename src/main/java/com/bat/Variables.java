package com.bat;

public class Variables {
    int k=20;
	public static void main(String[] args) {
		int i = 10;
		Variables v = new Variables();
		
		System.out.println(i);
		
		//System.out.println(k);
		//System.out.println(j);
		v.test1();
		v.teat2();

	}

	public void test1() {
		int j = 20;
		System.out.println(j);
		System.out.println(k);
	}
	public void teat2() {
		int y=30;
		System.out.println(k);
		System.out.println(y);
	}

}
