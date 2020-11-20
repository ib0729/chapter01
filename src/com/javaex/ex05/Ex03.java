package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {


		//로또번호 자동생성기 배열사용
		
		int[] lottoNums = new int[6];
		
		
		
		
		for(int i=0; i<=5; i++){						//for문
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		  
		//lottoNums.length --> 배열의 갯수 --> 6
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]); //i 0~5
		}//
		
		
		/*
		//ArrayIndexOutOfBoundsException --> lottoNums[6]       //오류
		for(int i=0; i<=lottoNums.length; i++) {
			System.out.println(lottoNums[i]); //i 0~5
		}
		*/
		
	
		/*
		for(int i=0; i<=5; i++) {    //for(int i=0; i<intArray.length; i++) { //  숫자 맨끝 할때 대부분씀
			System.out.println(lottoNums[i]); //i 0~5
		}
		*/
		
	}

}
