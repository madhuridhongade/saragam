import java.util.Scanner;
public class Age
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		if(age<0)
		{
			System.err.println("Invalid age:"+age);
		}else if(age<18)
		   {
				System.out.println("You are child");
		   }else if(age>=18)
		   {  
			   System.out.println("You are adult");
		   }else if(age>=60)
		   {
				System.out.println("You are senior citizen");
		   }
	}
}	