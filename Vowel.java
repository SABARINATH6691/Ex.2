import java.util.*;


 class checknum
 {
 	public static void main(String args[])
 	{ 
 	   char n;
		System.out.println("enter the number");
		Scanner Input=new Scanner(System.in);
		n=Input.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		{
			System.out.println("the number is vowel ");
		}
		else
		{
			System.out.println("the number is consonant");
		}
		}
 }
    
	

    
