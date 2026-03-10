// wap to find sum of first "n"+ve integers
//i/p:5	1+2+3+4+5=15
//i/p:3	1+2+3=6

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;   // same as sum = sum + i
            }

            System.out.println("Value = " + sum);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
