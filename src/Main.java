/*A program to reverse a string */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String that you would want to reverse: ");
        char [] letters = input.nextLine().toCharArray();
        System.out.println("Your reversed String is: ");

        for(int i=letters.length-1; i>=0 ; i--){
            System.out.println(letters[i]);
        }
        System.out.println("\n");

    }
}