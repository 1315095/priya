public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
if(n%4==0 || n%400==0)
System.out.println(n+"is leap year");
else
System.out.println(n+"is not leap year");
}
