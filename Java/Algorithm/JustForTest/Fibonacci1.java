package com.rumen1;

import java.util.Scanner;

//Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
//当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

public class Fibonacci1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
//		System.out.println(input);
		System.out.println(F(input)%10007);
	}
	public static int F(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		return F(n-1)+F(n-2);
	}
}
