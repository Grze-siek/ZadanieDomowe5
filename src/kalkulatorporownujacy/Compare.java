package kalkulatorporownujacy;

import java.util.Scanner;

public class Compare {

    void compareTwoNumbers()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę całkowitą:");
        int number1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Wprowadź drugą liczbę całkowitą:");
        int number2 = scan.nextInt();
        System.out.println("Wynik:");
        Logic(number1, number2);
    }
    private void Logic (int number1, int number2)
    {
        if (number1 > number2)
            System.out.println(number1 + number2);
        else if (number1 < number2)
            System.out.println(number1 * number2);
        else
            System.out.println(number1 * number2);
    }
}
