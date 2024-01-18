import java.util.*;

public class nxtRound
{
	public static void main(String []args)
	{
		int count=0;
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n;i++)
		{
			if(arr[i]>=arr[k-1] && arr[i]>=1)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}