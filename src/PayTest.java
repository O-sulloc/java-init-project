import java.util.Scanner;

public class PayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pay = 0;
        int[] currencyType = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("금액을 넣으세요: >>");

        pay = sc.nextInt();

        for (int i = 0; i < currencyType.length; i++) {
            System.out.println(currencyType[i] + "원?" + pay / currencyType[i] + "개");
            pay = pay - ((pay / currencyType[i]) * currencyType[i]);

        }

    }
}
