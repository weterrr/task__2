import java.util.Scanner;

public class choise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Что выберешь: 1 - калькулятор, 2 - поиск элемента в массиве");
        int o = scanner.nextInt();
        if (o == 1) {
            System.out.println("Введите первое число: "); // пользователь вводит с клавиатуры первое число
            double a = scanner.nextDouble();
            System.out.println("Введите второе число: ");  // пользователь вводит с клавиатуры второе число
            double b = scanner.nextDouble();
            System.out.println("Выберите желаемую операцию: 1 - '+', 2 - '-', 3 - '*', 4 - '/'");
            int c = scanner.nextInt();
            scanner.close();
            switch (c) {
                case 1:
                    System.out.println("Сумма чисел равна: ");
                    System.out.printf("%.4f", a + b);
                    break;
                case 2:
                    System.out.println("Разность чисел равна: ");
                    System.out.printf("%.4f", a - b);
                    break;
                case 3:
                    System.out.println("Произведение чисел равно: ");
                    System.out.printf("%.4f", a * b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("На ноль делить нельзя");  //отдельное условие для "0"
                        break;
                    }
                    System.out.println("Результат деления равен: ");
                    System.out.printf("%.4f", a / b);
                    break;
                default:
                    System.out.println("Выберите один из предложенных вариантов");
            }
        } else if (o == 2) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Сколько строк? ");
            int size = input.nextInt();
            if (size > 0) {                            //только если строк больше 0

                String array[] = new String[size + 1];
                System.out.println("Введите строки поочерёдно : ");
                int l = 0;
                String s = array[0];
                for (int i = 0; i < array.length; i++) {
                    array[i] = input.nextLine();
                }
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > l) {
                        s = array[i];
                        l = array[i].length();
                    }
                }
                System.out.println("Самое длинное слово, если их несколько, то первое: ");
                System.out.println(s);
            } else {
                System.out.println("Введите число строк больше 0");
            }
        } else {
            System.out.println("Ну всего же два варианта...");
        }
    }
}
