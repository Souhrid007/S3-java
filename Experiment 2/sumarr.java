import java.util.*;
class sumarr
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number of elements in array");
int n=obj.nextInt();
System.out.println("Enter the array elements");
int a[100];int sum=0;int i;
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(i=0;i<n;i++)
{
sum=(sum+a[i]);
}
System.out.println("Sum of elements in array="+sum);
}
}
