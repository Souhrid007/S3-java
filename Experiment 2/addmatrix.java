import java.util.*;
class addmatrix
{
	public static void main(String args[])
	{
		int i,j,r,c,p,q;
		System.out.println("Enter number of rows and columns of first matrix");
		Scanner minato=new Scanner(System.in);
		r=minato.nextInt();
		c=minato.nextInt();
		System.out.println("Enter number of rows and columns of second matrix");
		p=minato.nextInt();
		q=minato.nextInt();
		if(r==p && c==q)
		{
	 	 	int a[][]=new int[r][c];
		 	int b[][]=new int[p][q];
		 	int sum[][]=new int[p][q];
		 	System.out.println("Enter matrix a");
		 	for(i=0;i<r;i++)
		 	 {
				for(j=0;j<c;j++)
				{
				 a[i][j]=minato.nextInt();
				}
		 	 }
	 	 	System.out.println("Enter matrix b");
		 	for(i=0;i<p;i++)
			 {
			  for(j=0;j<q;j++)
		   	  b[i][j]= minato.nextInt();
		 	 }
		for(i=0;i<r;i++)
		 {
		  for(j=0;j<c;j++)
		  {
		   sum[i][j]=a[i][j]+b[i][j];
		  }
		 }
		System.out.println("The sum of the array is:");
		for(i=0;i<r;i++)
		 {
		  for(j=0;j<c;j++)
		  {
			System.out.println(sum[i][j]);
		  }
		 }
		}
		else
		System.out.println("Addition is not possible");
	}
}
