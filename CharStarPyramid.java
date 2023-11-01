public class CharStarPyramid
{
	public static void main(String[]args)
  {  
	  for(char i='a'; i<='f'; i++)
	  {
		  for(char j='e'; j>=i; j--)
		  {
		  System.out.print(" ");
		  }
	  
	      for(char k='a'; k<=i; k++)
	      {
		     if(k=='a')
		    {
			    System.out.print(k+" ");
		    }else if(i=='f')
		     {
			    System.out.print(k+" ");
		     }else if(k==i)
		     {
			    System.out.print("b"+" ");
		     }else {
			    System.out.print("*"+" ");  
		   }
	  }
	  System.out.println();
   }
}
}