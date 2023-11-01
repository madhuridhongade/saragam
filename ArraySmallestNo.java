import java.util.Scanner;
public class ArraySmallestNo
{
	public static void main(String[]args)
	{
		int[] x = {12,13, 4, 6,93}; //Print smallest no from array
		int min = x[1];
		
		for(int i=0; i<x.length-1; i++)
		{
		if(x[i]<min)
		{
			min = x[i];
		}
		}
		System.out.print("Smallest no is  "+ min); 
	}
}