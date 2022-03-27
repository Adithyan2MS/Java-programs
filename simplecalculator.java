import java.util.Scanner;
class simplecalculator
{
    public static void main(String args[])
    {
        int a,b,c=0,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:\n ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Operations");
        System.out.println("1.Addition");
         System.out.println("2.Substraction");
          System.out.println("3.Multiplication");
           System.out.println("4.Division");
            System.out.println("Enter Your Choice");
            x=sc.nextInt();
            switch(x)
            {
                case 1:c=a+b;
                break;
                case 2:c=a-b;
                break;
                case 3:c=a*b;
                break;
                case 4:c=a/b;
                break;
                default:System.out.println("Wrong Choice!!");
                break;

            }
            System.out.println("Result is "+c);

    }
}