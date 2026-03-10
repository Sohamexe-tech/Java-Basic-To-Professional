//wap to chant mantras "n" times

import java.util.*;

class p1
{
    public static void main(String[] args) throws InterruptedException
    {
    {
        double n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no: ");
        n =scanner.nextDouble();

        if(n>0)
        {
            for (int i = 0; i < n ; i++) 
            {
                System.out.println("Shree Swami Samarth");
                Thread.sleep(1000);
                System.out.println("Pralay");
                Thread.sleep(1000);

            }
  
        }
        else
        {
            System.out.println("Enter Correct Number");
        }
    }
    }
}