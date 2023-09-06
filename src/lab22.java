import java.util.Scanner;
public class lab22 {

        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("How many letter grades?");
            int num= input.nextInt();
            printNRandomLetterGrades(num);
        }
        public static void printNRandomLetterGrades(int n){


            for(int y=0;y<n;y++){
                String x="";
                int l=(int)(Math.random()*9);
                switch (l){
                    case 0 -> x="A+";

                    case 1-> x="A";

                    case 2 ->x="B+";

                    case 3-> x="B";

                    case 4-> x="C+";

                    case 5-> x="C";

                    case 6-> x="D+";

                    case 7-> x="D";

                    case 8-> x="F";
                }
                System.out.println(x);
            }
        }
    }

