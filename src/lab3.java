
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] Myarray = new int[size];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            Myarray[i] = input.nextInt();
        }

        if (isValid(Myarray)) {
            System.out.print("Valid");

        } else {
            System.out.print("Not Valid");


        }
    }

        public static boolean isValid(int[] array) {
            for (int k = 0; k < array.length-1; k++) {
                if (array[k] == array[k + 1]) {

                return false;
            }
        }
            return true;
        }
}