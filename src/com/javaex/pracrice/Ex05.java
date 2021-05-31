package com.javaex.pracrice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] n = new double [5];
		double sum=0;
		int a=0;
		
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
			sum=sum+n[i];
			a=a+1;
		}
		System.out.println("평균은 "+sum/a+" 입니다.");
		sc.close();

	}

}
