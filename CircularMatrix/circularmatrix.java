import java.util.*;
class demo
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		int n=obj.nextInt();
		int a[][]=new int[n][n];
		int row1=0,row2=n-1,column1=0,column2=n-1;
		int m1=1;
		while(n*n >=m1)
		{
			for(int i=column1;i<=column2;i++)
			{
				a[row1][i]=m1++;
			}
			for(int j=row1+1;j<=row2;j++)
			{
				a[j][column2]=m1++;
			}
			for(int k=column2-1;k>=column1;k--)
			{
				a[row2][k]=m1++;
			}
			for(int n1=row2-1;n1>=row1+1;n1--)
			{
				a[n1][column1]=m1++;
			}	
	
			row1++;
			column1++;
			row2--;
			column2--;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print( " "+a[i][j]);
			}
			System.out.println("\n");
		}
	}
}