package Lesson;

public class Lesson {
    public static void printSeparator() {
        System.out.println("++++++++++++++++++++");
        System.out.println("--------------------");
    }
    // Объявляем метод
    public static void main (String[]args){
            int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
            printSeparator();
            // Вызываем объявленный ранее метод
            for (int i = 0; i < issuesByMonths.length; i++) {
                System.out.println(issuesByMonths[i]);
                if ((i + 1) % 3 == 0) {
                    printSeparator();
                    // Вызываем объявленный ранее метод
                }
            }
            printSeparator();
            // Вызываем объявленный ранее метод
        }
    }


