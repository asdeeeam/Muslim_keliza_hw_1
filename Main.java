
import java.util.Scanner;public class Main {
     static void main(String[] args) {
        String myHobbyIsSport;
        final int NUM = 10;
        String word = "apple";
        myHobbyIsSport = NUM + " boxer " + word;
        System.out.println(" " + myHobbyIsSport);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println(" ВЫ Сохранили ноль");
        }
        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
                        String name = scanner.nextLine();
      System.out.println("Привет," + name + "!");
    }}