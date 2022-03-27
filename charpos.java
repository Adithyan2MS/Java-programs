import java.util.Scanner;
class charpos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        char n;
        System.out.println("Enter a String");
        str=sc.nextLine();
        n=str.charAt(3);
        System.out.println("Character at position 3 is "+n);

    }
    
}