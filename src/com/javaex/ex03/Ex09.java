package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
			
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바  2.C  3.C++  4.파이썬");
		System.out.print("과목번호:");
		
		int point = sc.nextInt();
		
		if(point==1) {
			System.out.println("R101호");
		}else if(point==2) {
			System.out.println("R202호");
		}else if(point==3) {
			System.out.println("303호");
			
		}else if(point==4) {
			System.out.println("404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		
		
		
		
		
		
    	sc.close();
	}

}
