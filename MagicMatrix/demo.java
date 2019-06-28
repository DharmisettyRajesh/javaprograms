import java.util.*;
class demo
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n,i,j,m=1;
		int a[][];
		System.out.println("enter a number");
		n=obj.nextInt();
		i=0;
		j=n/2;
		a=new int[n][n];
		a[i][j]=m++;
		while(m !=(n*n+1))
		{ 
			while(true)
			{
			i--;
			j--;
			if(i==-1 && j!=-1)
			{
				i=n-1;
				a[i][j]=m++;
				break;
			}
			if(i!=-1 && j==-1)
			{
				j=n-1;
				a[i][j]=m++;
				break;
			}
			if(i==-1 && j==-1)
			{
				i=i+2;
				j++;
				a[i][j]=m++;
				break;
			}
			if(i !=-1 && j!=-1)
			{
				if(a[i][j]==0)
				{
				//i=i+2;
				//j++;
				a[i][j]=m++;
				break;
				}
				else
				{
				i=i+2;
				j++;
				a[i][j]=m++;
				break;
				}
			}
		}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print( " "+a[i][j]);	
			}
			System.out.println();
		}
	}
}	