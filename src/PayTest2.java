public class PayTest2 {

    public static void main(String[] args) {

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        int refund = 25400;

        System.out.printf("5만원권 %d장 나머지:%d\n", refund / curr50000, refund % 50000);
        System.out.printf("1만원권 %d장 나머지:%d\n", refund / curr10000, refund % 10000);
        //refund = refund - ((refund/curr1000)*10000);//5000원권은 한 장만 나오게 하고 싶다. 왜냐면 위에서 만원권 2장 나왔기 때문이다.
        refund = refund % 10000; //이것도 가능. modulo라고 한다. (나머지 mod %)

        System.out.printf("5천원권 %d장 나머지:%d\n", refund / curr5000, refund % 5000);
        refund = refund % 5000;

        System.out.printf("1천원권 %d장 나머지:%d\n", refund / curr1000, refund % 1000);
        refund = refund % 1000;

        System.out.printf("5백원권 %d장 나머지:%d\n", refund / curr500, refund % 500);
        refund = refund % 500;

        System.out.printf("1백원권 %d장 나머지:%d\n", refund / curr100, refund % 100);
        refund = refund % 100;

        System.out.printf("5십원권 %d장 나머지:%d\n", refund / curr50, refund % 50);
        System.out.printf("1십원권 %d장", refund / curr10);


    }
}
