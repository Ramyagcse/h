import java.util.Scanner;
public class LeapYear
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number to find leapyear or not");
int n=s.nextInt();
if(n%4==0)
{
System.out.println("the number is leap year");
}
else
{
System.out.println("the number is not a leapyear");
}
}