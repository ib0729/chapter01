package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
	
		String name = sc.nextLine();		
		
		System.out.println("나이를 입력해 주세요.");
		
		System.out.print("나이:");
				
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name + " 나이는 "+  age  +" 입니다." );
				
		sc.close();  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine(); //숫자를 입력받은 후 문자열//
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
	
		String name = sc.nextLine();
		System.out.println("당신의 나이는 " + age + " 이름은 "+  name  +" 입니다." );
		

		sc.close();
		
		
		
		
		
		
		
		
		
	
	}

}
