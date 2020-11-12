package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pay; //급여 -->위에 선언한 이유 고민 해볼 것
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
				
		int time = sc.nextInt();
		
		
		if(time>8) {
			pay  = 8*10000+(time-8)*15000;
	
		}else {
			pay = time*10000;
		}
		
		
		System.out.println("임금은" + pay + "입니다.");
		
		sc.close();
	}

}
