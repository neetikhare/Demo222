package in.cdac.assignment3;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for printing table:");
		int num=sc.nextInt();
		for(int a=1;a<=10;a++)
		{
			int tab=num*a;
			System.out.print(" " +tab);
		}

	}

}
