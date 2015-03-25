package com.rumen3;

import java.util.Scanner;
//超过指定时间
public class xuliehe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long input=sc.nextLong();
		System.out.println(F(input));
	}
	public static long F(long n){
		long sum=0;
		for(long i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
}
