import java.util.Scanner;
class freq
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter the string"); 
         String str=sc.next();
        
        System.out.println("Enter the charcater"); 
         char ch=sc.next().charAt(0);
 
        int count=0;
       
        int size=str.length(); 
 
        for(int i=0;i<size;i++) 
         { 
             char che=str.charAt(i); 
             if(ch==che) 
              count++;
         }  
        System.out.println("Frequency of "+ch+" in the string : "+count); 
    }
}
