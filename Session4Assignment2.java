import java.util.Scanner;
import java.util.Arrays;
public class Session4Assignment2 {

	public static void main(String[] args) {

	int [] first=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 Elements of Array");
	for(int i=0;i<5;i++)
	{
		first[i]=sc.nextInt();
	}
	
	System.out.print("Enter the Element to be Inserted :-> ");
	first[5]=sc.nextInt();
	sc.close();
	Arrays.sort(first);
	System.out.print("Sorted array is:-> ");
	
	for(int i=0;i<first.length;i++)
	{
		System.out.print(first[i]+" ");
	}

	}

}
