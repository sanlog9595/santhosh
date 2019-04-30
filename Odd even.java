import java.util.scanner
class OddOrEven
{
public static void main(String args[])
{
int x;
System.out.println("Enter an integer to check if it is odd or Even");
Scanner in=new Scanner(System.in);
x=in.nextInt();
if(x%2==0)
System.out.println("the number is even.");
else
System.out.println("the number is odd.");
}
}
