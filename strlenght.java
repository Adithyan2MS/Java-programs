import java.util.Scanner;
class strlenght
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int len;
        System.out.println("Enter a String");
        str=sc.nextLine();
        len=str.length();
        System.out.println("Length is "+len);
    }
}