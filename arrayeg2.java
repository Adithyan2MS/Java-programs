//initializing from user(Indirectly) and Displaying
import java.util.Scanner;
class arrayeg2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int array[]=new int[10];
        System.out.println("Enter the elements of array:\n");
        for( i=0;i<10;i++)
        {
        array[i]=sc.nextInt();
        }
        System.out.println("Entered Elements is");
        for(i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }
    }
}