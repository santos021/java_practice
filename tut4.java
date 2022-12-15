// write a program to check the number is even or odd

import java.util.*;

class tut4 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        
        if (num % 2 == 0) 
        {
            System.out.println ("Even");
        }
        else 
        {
            System.out.println ("Odd");
        }
        
    }
}
