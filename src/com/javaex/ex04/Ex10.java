package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0 && i%3==0) {
				continue;
				//break;
				//System.out.println("break문");     잘못됨 만약 할거면 break; 위에다
			}
								
			
			System.out.println(i);
		}
		System.out.println("종료");
		
	}

}
