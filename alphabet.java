public static void main(String[] arg)
{
Scanner in=new Scanner(System.in);
char a;
System.out.println("enter the character");
a=in.next().charAt(0);
if((a>=65&&a<=90)||(a>=97&&a<=122))
System.out.println(a+" is an alphabet");
else
System.out.println(a+" is not an alphabet");
}
