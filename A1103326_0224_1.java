import java.util.Scanner;

public class A1103326_0224_1
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("輸入一個整數：");
        int number = input.nextInt();

        if(number % 2 == 0) 
        {
            System.out.println(number + " 是偶數。");
        } 
        else 
        {
            System.out.println(number + " 是奇數。");
        }
    }
}