package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int point = sc.nextInt();
		
		if(point>=60) {
			System.out.println("합격입니다.");
		}else {                                            //참일떄는 else 발동 합격 아닐땐 불합격
			System.out.println("불합격입니다."); 
		}
		
		
		
		System.out.println("종료");
		
		sc.close();
		
	}

}
