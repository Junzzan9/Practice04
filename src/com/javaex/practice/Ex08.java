package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] n = new int[6];
		
			for(int i=0;i<n.length;i++) {
				n[i]=(int)(Math.random()*45)+1;
				
				for(int j=0;j<i;j++) {
					if(n[i]==n[j]) {
						i--;
					}
				}
		
			}
		
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]+"  ");
		}
	}
}


