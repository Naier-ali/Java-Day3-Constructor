package com.day3;
import java.util.*;
public class PrimeNumber {

	//public static void main(String[] args) {
		

		//public class Solution {
		    public static void printPrime(int n)
		    {
		        int factor=0;
		        for(int i=2;i*i<=n;i++)
		        {
		            if(n%i==0)
		            {
		              factor++;
		                break;
		            }
		        }
		        if(factor==0)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }

		    public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        printPrime(n);
		    }

}
