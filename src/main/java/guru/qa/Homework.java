package guru.qa;

public class Homework {

    public static void checkOperators() {

        int a = 2;
        int b = 5;
        int c = 8;
        int d = 4;
        long l = 756890;
        double dd = 3.23;
        float ff = 0.1F;

            //Арифметические операторы
            int aInt1 = a + b;
            int aInt2 = a - b;
            int aInt3 = a * b;
            int aInt4 = b / a;
            int aInt5 = b % a;
            System.out.println("2 + 5 = " + aInt1);
            System.out.println("2 - 5 = " + aInt2) ;
            System.out.println("2 * 5 = " + aInt3);
            System.out.println("5 / 2 = " + aInt4);
            System.out.println("5 % 2 = " + aInt5);
            //Операторы сравнения
            boolean result1= a == b;
            boolean result2= a != b;
            boolean result3= a > b;
            boolean result4= d < b;
            boolean result5= b >= a;
            boolean result6= b <= a;
            boolean result8=(a < b && c > b);
            boolean result9=(a < b || c < b);
            System.out.println("2 == 5 - " + result1);
            System.out.println("2 != 5 - " + result2);
            System.out.println("2 > 5 - " + result3);
            System.out.println("4 < 5 - " + result4);
            System.out.println("5 >= 2 - " + result5);
            System.out.println("5 <= 2 - " + result6);

            //Логические операторы
            System.out.println("(2 < 5 && 2 != 5) is " + result8);
            System.out.println("(2 < 5 || 8 > 5) is " + result9);
        }

    public static void operationWithDifferentTypes() {
        System.out.println("Пример сложения переменных int и double, результат приведен к double: 255 + 3.14  " + (255 + 3.14));
        System.out.println("Пример сложения переменных int и String, результат приведен к строке: 255 + \"строка\" = "  + ( 255 + " строка"));
    }
        public static void overflow() {
            int aInt1 = 1000000000;
            int aInt2 = -2147483647;
            int aInt3 = 2000000000;
            int overflowMinResult = aInt2 - aInt1;
            int overflowMaxResult = aInt1 + aInt3;

            System.out.println("Overflow int minimum result: int -2147483647 - int 1000000000 = " + overflowMinResult);
            System.out.println("Overflow int maximum result: int 1000000000 + int 2000000000 = " + overflowMaxResult);


        }

    public static void main(String[] args) {
        checkOperators();
        operationWithDifferentTypes();
        overflow();
    }
}