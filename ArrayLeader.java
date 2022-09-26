package in.cdac.assignment6;
import java.util.Scanner;

public class ArrayLeader {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of Array:");
		 int size=sc.nextInt();
		 int arr[]= new int[size];
		 System.out.println("stores numbers in Array:");
		 for(int a=0; a<arr.length ; a++)
		 {
			 arr[a]=sc.nextInt();
		 }
		 System.out.print("Leaders numbers in the array are: ");
		 for(int a=0; a<arr.length; a++)
		 {
			 int leader=1;
			 for(int b=a+1; b<arr.length; b++)
			 {
				 if(arr[a]<arr[b]) 
				 {
					 leader=0;
					 break;
				 }
			 }
			 if(leader==1)
				 System.out.print(arr[a]+ " ");
		  }				 
	}
}
