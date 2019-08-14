import java.util.Scanner;
 
class Largest
{
  public static void main(String args[])
  {
    int N;
    System.out.println("Enter the integers");
    Scanner in = new Scanner(System.in);
 
    N = in.nextInt();
   int  sum = 0;
        for(int i = 1; i <= N; ++i)
        {
            
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
} 
    
