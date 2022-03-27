import java.util.Scanner;
class joinstring
{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        String str1,str2,newstr;
        System.out.println("Enter 2 Strings");
        str1=sc.nextLine();
        str2=sc.nextLine();
        newstr=str1+ str2;
        System.out.println(""+newstr);
    }
}