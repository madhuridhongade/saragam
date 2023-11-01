public class Array1
{
	public static void main(String[]args)
	{
		byte[]x={10,11,12,13,14};
		int addition=0;
		
		for(int i=0; i<=3; i++)
		{
			//System.out.print(x[i]+",");
			
			x[0]=(byte)(x[i]+x[i+1]);
			
			System.out.print(x[0]+" "); 
		}
		  //printing privious no with next no
	}
}