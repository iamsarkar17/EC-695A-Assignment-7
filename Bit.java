// Java program to set
// 4-th bit of a number

import java.util.Scanner;

class Bit
{
    static int setKthBit(int n, int k)
    {
        return (n ^ (1 << (k-1)));
    }

    // main function  
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int k = 4;
        System.out.println(setKthBit(n , k));
    }
} 