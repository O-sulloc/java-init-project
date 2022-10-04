package evenOddAdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();



        if (num % 2 != 0) {
            System.out.print("홀수");
        } else {
            System.out.print("짝수");
        }

        System.out.print("+");

        if (num2 % 2 != 0) {
            System.out.print("홀수");
        } else {
            System.out.print("짝수");
        }
        System.out.print("=");

        if ((num + num2) % 2 == 0) {
            System.out.print("짝수");
        }else {
            System.out.print("홀수");
        }
    }
}
