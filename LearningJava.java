import java.util.Scanner;
public class LearningJava{
<<<<<<< HEAD
public static void main(String[]args){
        System.out.println("hello there.");
// testing
        }
=======
    public static void main(String[]args){
        //declare variables
        String original, reverse = "";
        //create scanner
        Scanner in = new Scanner(System.in);
        // tell them what to type and record it. store it
        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");
    }
>>>>>>> 0dcf0384a56c40d53ca2af3184f50460928f677e
}