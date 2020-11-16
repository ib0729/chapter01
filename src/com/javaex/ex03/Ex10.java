package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과목코드를 입력하세요");
		System.out.println("과목코드: ");
		
		int code = sc.nextInt();
		
		switch(code) {
		case 1:
			System.out.println("R101호");
			break;
		case 2:
			System.out.println("R202호");
			break;
		case 3:
			System.out.println("R303호");
			break;
		case 4:
			System.out.println("R404호");
		default :
			System.out.println("상담원 문의");
			break;
			
			
			
		}
		
		
				
				
				
				
				
				
				sc.close();
	}

}
