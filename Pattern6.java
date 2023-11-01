public class Pattern6
{
	public static void main(String[]args)
	{	
		int i,j,Row =6;
		for(i=0; i<=Row; i++)
		{

			for (j = Row - i; j > 1; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
			
			
				for(j=0; j<=i; j++)
				{
					System.out.print("* ");
				}
					System.out.println();
		}			
	}
}