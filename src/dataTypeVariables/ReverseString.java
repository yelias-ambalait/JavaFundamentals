package dataTypeVariables;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter String input: ");

        char[] letters = s.nextLine().toCharArray();

        System.out.println("\nCharacter Array: ");
        for (char c : letters) {
            System.out.print(c);
        }
//        demha sailey si eman ym
        System.out.println("\n\nReversed String: ");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }
}
