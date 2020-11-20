package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간: ");
		int time = sc.nextInt();
				if(time>8) {
			pay = 10000*8+(time-8)*12000;
		}else {
			pay = time*10000;
		}
		
		
		
		System.out.println("임금은" + pay + "입니다.");
		
		
		
		sc.close();
		
	}

}
