
import java.util.Scanner;
public class printNRandomLetterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many courses? ");
        int courses = input.nextInt();
        pp(courses);
    }
        public static void pp(int l){
        for( int n = 0; n<l; n++) {
            int k = (int) (Math.random() * 9);
            switch (k) {
                case 0 -> System.out.println("A+");
                case 1 -> System.out.println("A");
                case 2 -> System.out.println("B+");
                case 3 -> System.out.println("B");
                case 4 -> System.out.println("C+");
                case 5 -> System.out.println("C");
                case 6 -> System.out.println("D+");
                case 7 -> System.out.println("D");
                case 8 -> System.out.println("F");


            }


        }
    }
}