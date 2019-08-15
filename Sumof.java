import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args) 
    {
        int N,k,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array & k value\n");
        N= s.nextInt();
        k= s.nextInt();
        int a[] = new int[N];
        System.out.println("Enter all the elements:\n ");
        for(int i = 0; i < N; i++)
        {
            a[i] = s.nextInt();
            
        }
        for(int i = 0; i <k; i++)
        {
            sum=sum+a[i];
            
        }
        System.out.println("Sum:"+sum);
    }
}  
