import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,sum=0,rem;
        System.out.println("Enter a Number:");
        n=sc.nextInt();
        a=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(a==sum)
        {
            System.out.println(+a+" is Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    } 
}