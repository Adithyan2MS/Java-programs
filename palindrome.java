import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,newnum=0,rem;
        System.out.println("Enter the Number:");
        n=sc.nextInt();
        a=n;
        while(n>0)
        {
            rem=n%10;
            newnum=newnum*10+rem;
            n=n/10;
        }
        if(a==newnum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}