import java.util.*;


 class checknum
 {
 	public static void main(String args[])
 	{ 
 	   int num;
		System.out.println("enter the number");
		Scanner Input=new Scanner(System.in);
		num=Input.nextInt();
		if(num<0)
		{
			System.out.println("the number is invalid ");
		}
    	
		else if(num%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		}
 }
    
