import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nameOfSchool;
        final int NUM = 10;
        String word = "My world";
        nameOfSchool = NUM + word;
        System.out.println("10" +  ", NUM + word" + ", My world");

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число.");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число.");
        } else {
            System.out.println("Вы сохранили ноль");
        }



        System.out.println(" Введите ваше имя!");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!" );





        }
    }





