import java.util.*;
class smallarr
{
public static void main(String args[])
 {
	int a[]=new int[100],i,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number of elements in array");
	n=obj.nextInt();
	
	for(i=0;i<n;i++)
	{System.out.println("Enter the array elements");
	  a[i]=obj.nextInt();
	}
	int min=a[0];
	for(i=0;i<n;i++)
	{
	  if(a[i]<min)
	   min=a[i];
	  else
	   continue;
	}
	System.out.println("Smallest element in array="+min);
  }
}
