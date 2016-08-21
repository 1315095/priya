import java.util.Scanner;
public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int n, fact=1;
System.out.println("enter n:");
n=in.nextInt();
for(int a=1;a<=n;a++);
{
fact=fact*a;
}
System.out.print(n+" fact is "+fact);
}
