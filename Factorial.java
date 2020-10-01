import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n,j,d,s=0,f=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
n=sc.nextInt();
for(int i=n;i>0;i=i/10)
{
d=i%10;
f=1;
for(j=1;j<=d;j++)
{
f=f*j;
}
s=s+f;
}
if (s==n)
{
System.out.println("Sum of Factorial of Digit is equal to the Number");
}
else{
System.out.println(" Sum of Factorial of Digit is not equal to the Number");
}
}
}