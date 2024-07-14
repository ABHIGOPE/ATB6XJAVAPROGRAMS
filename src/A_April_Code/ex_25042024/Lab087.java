package A_April_Code.ex_25042024;
import java.util.Scanner;
public class Lab087 {
        public static void main(String[] args) {
            int itemCode = 001;
            // JDK > 13

            switch (itemCode) {
                case 001 -> System.out.println("It's a laptop!");
                case 002 -> System.out.println("It's a desktop!");
                case 003, 004 -> System.out.println("It's a mobile phone!");
                default -> System.out.println("Heloo!");
            }
            System.out.println("Enter you char");
            Scanner sc = new Scanner(System.in);
            char yo =sc.next().charAt(0);
            switch (yo) {
                case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
                // - >
            }


        }
    }

