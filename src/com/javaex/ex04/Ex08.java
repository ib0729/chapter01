package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {


	      //예제1
	      /*
	      int num = 1;
	       
	      
	      while(true) {
	   
	         if(num%6==0 && num%14==0) {
	            System.out.println(num);
	            break;
	         }
	         
	         num++;
	       
	      }
	       */

	      //예제2
	      for(int no=1; no<=100; no++) {
	         if(no%6==0 && no%14==0) {
	            System.out.println(no);
	            break; //break 없으면 84까지 나옴
	         }
	      }
	      

	   }

	}