package com.javaex.pracrice;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;
		
		int result = 0;
		
		for(int i=0;i<intArray.length;i++) {
			result = result+intArray[i];
		}
		System.out.println(result);
	}
	
	
	
	// for문 i값범위가 intArray의 개수를 초과하여 오류발생;
	// intArray의 값을 정하지않을시 정수형은 0이므로 답 : 22

}
