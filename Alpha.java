import java.util.*;


 class checknum
 {
 	public static void main(String args[])
 	{ 
 	   char n;
		System.out.println("enter the number");
		Scanner Input=new Scanner(System.in);
		 n=Input.next().charAt(0);
		
	   if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
		System.out.println(n+" is a Consonant");
	   else
		System.out.println("Input is invalid");		
        
		}
 }
