package If_Problem;

import java.util.Scanner;

public class TestScore {

    public static void main(String args[]) {
//        //시험 성적 #9498
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (90 <= a && a <= 100) {
            System.out.println("A");
        } else if (80 <= a && a < 90) {
            System.out.println("B");
        } else if (70 <= a && a < 80) {
            System.out.println("C");
        } else if (60 <= a && a < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
