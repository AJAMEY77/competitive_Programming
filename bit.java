import java.util.*;

public class bit
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		
		int X=0;
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr=new int[3];
		
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			
			for(int j=0;j<3;j++)
			{
				arr[j]=str.charAt(j);
			}
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i]);
			}
			/*
			if((arr[0]=="+" && arr[1]=="+") || (arr[1]=="+" && arr[2]=="+"))
			{
				X++;
			}
			else if((arr[0]=="-" && arr[1]=="-") || (arr[1]=="-" && arr[2]=="-"))
			{
				X--;
			}*/
		}
		
		
		
		System.out.println(X);
		
	}
}