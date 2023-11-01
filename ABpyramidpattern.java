public class ABpyramidpattern
{
	public static void main(String[] args)
	{
		for(int line=1; line<=4; line++)
		{
			for(int space=3; space>=line; space--)
			{
				System.out.print(" ");
			}
			char x ='a';
			for(int astr=1; astr<=line; astr++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
} 
 //    a
 //   a b
 //  a b c
 // a b c d