import java.util.Scanner;
public class ArraySmallestNo1
{
	public static void main(String[]args)
	{
		int[] x = {10,20,5,30,60};
		
		int min = x[x.length-1];
				
		for(int i=x.length-1; i>0; i--)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.print("SMallest no is: "+ min);  //print smallest no from array using length property
		
	}
}