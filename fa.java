
 import java.util.Scanner;
public class fact {

  
    
    public static void main(String[] args) 
{
        Scanner in=new Scanner(System.in);
int n, fact=1;

System.out.print("enter value of n:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
System.out.println(fact);
        
        
    }
    
}
}