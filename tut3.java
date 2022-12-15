// conditional statements in java

import java.util.*;

class tut3 {
    public static void main (String[] args)
    {
    Scanner sc = new Scanner (System.in);
    int age= sc.nextInt();
    sc.close();

        if (age >= 18) 
        {
            System.out.println ("Adult");
        }
        else 
        {
            System.out.println ("Child");
        }

    }
     
    
}
