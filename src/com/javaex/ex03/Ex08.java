package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int point = sc.nextInt();
					
		if(point>0) {
			
			if(point%2==0) { //짝수니??
			//짝수일떄코드
				System.out.println("짝수");
			}else {
				//홀수(짝수아닌 나머지) 일때 코드
				System.out.println("홀수");
				
			}
			
			}else if(point<0) {
				System.out.println("음수");
			}else {
				System.out.println("0");
		
			    }
		
		
		
		
		sc.close();
	}

}
