package tablicazsumowaniem;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        int[] liczby = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę wprowadzić pięć liczb całkowitych:");
        int firstNumber = scan.nextInt();
        scan.nextLine();
        int secondNumber = scan.nextInt();
        scan.nextLine();
        int thirdNumber = scan.nextInt();
        scan.nextLine();
        int fourthNumber = scan.nextInt();
        scan.nextLine();
        int fifthNumber = scan.nextInt();
        scan.nextLine();
        liczby[0] = firstNumber;
        liczby[1] = secondNumber;
        liczby[2] = thirdNumber;
        liczby[3] = fourthNumber;
        liczby[4] = fifthNumber;
        int sum = liczby[0] + liczby[2] + liczby[4];
        System.out.println("Suma: " +  sum);
    }
}
