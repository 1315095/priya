import java.util.Scanner;
public class prime {

  
    
    public static void main(String[] args) 
{
        Scanner in=new Scanner(System.in);
int n;

System.out.print("enter value of n:");
n=in.nextInt();
for(int i=2; i<=n/2; i++)
{
            if(n % i == 0)
            {

System.out.println(n+" is not a prime number");
            }
            else
 System.out.println(n+" is  a prime number");
}
       
    
}
    

}