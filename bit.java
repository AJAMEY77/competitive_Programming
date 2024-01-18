
import java.util.*;

public class bit
{
     public static void main(String []args)
     {
          int n, X=0;
          char[] ch = new char[3];
		  String str;
          
          Scanner sc =new Scanner(System.in);
          n = sc.nextInt();
		  sc.nextLine();
          
          for(int i=0;i<n;i++)
          {
               str = sc.nextLine();
			   for(int j=0;j<3;j++)
			   {
				   ch[j]=str.charAt(j);
			   }
               
               if(ch[1]=='+')
               {
                    X++;
               }
               else
               {
                    X--;
               }
          }
          System.out.println(X);
     }
}









/*
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
			
			if(str=="x++" || str=="++x" || str=="X++" || str=="++X")
			{
				X++;
			}
			else if(str=="x--" || str=="--x" || str=="X--" || str=="--X")
			{
				X--;
			}
		}
		System.out.println(X);
		
	}
}
*/