import java.util.*;
public class Arrayprimenum
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int count = 0;
		int m[] = new int[5];
		System.out.println("Enter 5 elements:");
		
		for(int i=0; i<5; i++)
			m[i]=in.nextInt();
		System.out.println("The prime numbers are: ");
		
		for(int j=0; j<5; j++)
		{
			for(int k=1; k<=m[j]; k++)
			{
				if(m[j]%k ==0)
					count++;
			}
			if(count==2)
				System.out.println(m[j]);
				count=0;
		}
	}
}