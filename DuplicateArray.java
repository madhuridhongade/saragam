public class DuplicateArray
{
	public static void main(String[]args)
	{
		int arr[] = {11,13,15,11,45,13,18,32,15};
		System.out.print("Duplicate elment in given array:");
		
		//finding duplicate array element
		int count=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}