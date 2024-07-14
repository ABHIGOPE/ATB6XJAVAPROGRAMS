package A_April_Code.ex_25042024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        System.out.println("Enter you char");
        Scanner sc = new Scanner(System.in);
        char yo =sc.next().charAt(0);
        int val = switch (yo) {
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("Error");
        };
    }
}