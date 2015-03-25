package com.rumen1;

//Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
//当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
//超过时间

import java.util.Scanner;

public class Fibonacci {
	public static int Calculate(int num) {
		int a = 1, b = 1;
		int sum = 0;
		for (int i = 1; i < num - 1; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(Calculate(input) % 10007);
	}
}
