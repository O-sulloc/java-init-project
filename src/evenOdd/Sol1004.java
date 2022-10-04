package evenOdd;

import java.util.Scanner;

public class Sol1004 {
    public static void main(String[] args) {
        System.out.printf("Hello", args);
    }
}

 class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Main3 {
    public static void main(String[] args) {
        System.out.printf("Hello\nWorld");
    }
}

class Main4 {
    public static void main(String[] args) {
        System.out.println("\'Hello\'");
    }
}

class Main5 {
    public static void main(String[] args) {
        System.out.println("\"Hello World\"");
    }
}

class Main6 {
    public static void main(String[] args) {
        System.out.println("\"!@#$%^&*()\"");
    }
}

class Main7 {
    public static void main(String[] args) {
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }
}

class Main8 {
    public static void main(String[] args) {
        //https://unicode-table.com/en/blocks/box-drawing/

        System.out.printf("\u250C\u252C\u2510\n");
        System.out.printf("\u251C\u253C\u2524\n");
        System.out.printf("\u2514\u2534\u2518\n");
    }
}

class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        //char타입은 scanner로 입력받을 수 없다.
        //하지만 charat이 있음.
        //String으로 저장된 문자열 중에서 한 글자만 선택해서 CHAr타입으로 변환해줌

        System.out.println(ch);
    }
}