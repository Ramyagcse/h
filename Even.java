import java.util.scanner;
public class Even
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number to find even or odd");
int n=s.nextInt();
if(n%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}
}