package com.greatlearning.dsa.assignment;

import java.util.*;

public class Operations {
	public void operation(double[] parr, int n,boolean[] priceRose) {
		
		int choice,a=0,position=0;    
		int trueCount=0,falseCount=0;
		float search;
		Scanner scn = new Scanner(System.in);
		
		Sort mergesort = new Sort();
		mergesort.sort(parr, 0, parr.length - 1);
		
		order ord = new order();
		Search linearSearch = new Search();
		
		binarySearch binarySearch = new binarySearch();
		
		while(a==0) {
			System.out.println("1. Display the companies stock prices in ascending order\r\n"
					+ "2. Display the companies stock prices in descending order\r\n"
					+ "3. Display the total no of companies for which stock prices rose today\r\n"
					+ "4. Display the total no of companies for which stock prices declined today\r\n"
					+ "5. Search a specific stock price\r\n"
					+ "6. press 0 to exit");
					choice = scn.nextInt();
					switch(choice) {
					case 1: System.out.println("Stock prices in ascending order are");
							order.displayPricesAscendingOrder(parr);
								break;
					case 2: System.out.println("Displaying the companies stock prices in descending order");
							order.displayPricesDescendingOrder(parr);
							break;
					case 3: System.out.println("Total no of companies whose stock price rose today : "
							+ linearSearch.countCompaniesInProfit(priceRose));
							System.out.println(trueCount);
							break;
					case 4: System.out.print("Displaying the total no of companies for which stock prices declined today : ");
							for(int i=0;i<n;i++) {
								if(priceRose[i]==false) {
									falseCount++;
								}
							}
							System.out.println(falseCount);
							break;
					case 5: {
						double key;
						System.out.println("enter the key value");
						key = scn.nextDouble();
						binarySearch.searchValue(parr, key);

					}

						break;
					case 6: a=1;
							System.out.println("Terminated....");
							break;
					
					}			
		
  }
}
}