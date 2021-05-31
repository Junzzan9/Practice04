package com.javaex.pracrice;

public class Ex03 {

	public static void main(String[] args) {
		int[] intA = {3,6,9};
		int[] intB;
		intB=intA;
		intB[0]=20;
		intB[2]=10;
		
		for(int i=0;i<intA.length;i++) {
			System.out.println(intA[i]);
		}
		
	}

}

//intB=intA 선언을 한후 intb값을 주었고 초기에 A값은 남아있으니 
// 답은: 20 6 10 일 것이다.
