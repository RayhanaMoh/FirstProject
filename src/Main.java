import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of courses: ");
        int course = input.nextInt();
        double total = 0;
        double point = 0;
        int creditTotal = 0;
        System.out.printf("Enter letter grade, credit hours for %d courses", course);
        for (int i=0; i< course; i++){
            String grade = input.next();
            int credit = input.nextInt();
            switch (grade){
                case "A+" -> point =4;
                case "A" -> point = 3.75;
                case "B+" -> point = 3.5;
                case "B" -> point = 3;
                case "C+" -> point = 2.5;
                case "C" -> point= 2;
                case "D+"-> point = 1.5;
                case "D" -> point = 1;
                case "F" -> point =0;

            }
            creditTotal =creditTotal+ credit;
            total = total+ point*credit;

        }
        double gpa = total/creditTotal;
        System.out.println("GPA: " + gpa);
    }
}