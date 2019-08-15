import java.util.Scanner;
public class Array
{
    public static void main(String[] args) 
    {
        int N,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no ");
        N= s.nextInt();
        
        
        while(N!=0)
        {
        	N=N/10;
        	sum++;
        }
           System.out.println("Sum:"+sum);
    }
}  
