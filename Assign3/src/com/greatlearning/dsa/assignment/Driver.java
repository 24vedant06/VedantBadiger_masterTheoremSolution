package com.greatlearning.dsa.assignment;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		double arr[];
		boolean priceRose[];
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int n = scn.nextInt();
		System.out.println("Enter the cost of the company stocks");
		arr = new double[n];
		priceRose = new boolean[n];
		for(int i=0;i<n;i++) {
			System.out.print("Price of company "+(i+1)+" : ");
			arr[i]=scn.nextFloat();
			System.out.println("Whether company"+(i+1)+"'s"+" stock price rose today compare to yesterday?(respond with True/False)");
			priceRose[i]=scn.nextBoolean();
			
		}
		System.out.println("Prices of stocks of following companies");
		for(int i=0;i<n;i++) {
			System.out.print("Company "+(i+1)+": ");
			System.out.println(arr[i]);
			System.out.println(priceRose[i]);
		}
		
		Operations op = new Operations();
		op.operation(arr,n,priceRose);
		
	}
}
		
		