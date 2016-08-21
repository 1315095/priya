public static void main(string[] arg)
{
Scanner in=new Scanner(System.in);
int n,reverse=0;
System.out.println("enter n to reverse");
n=in.nextInt();
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}
System.out.println(n+"reversed is "reverse);
}