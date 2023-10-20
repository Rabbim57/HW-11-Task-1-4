package Lesson;

public class Lesson {
    public static void printSeparator() {
        System.out.println("++++++++++++++++++++");
        System.out.println("--------------------");
    }
    // Объявляем метод
    public static void printIssues(int issueCount) {
// Создаем отдельный метод для печати дефектов
        System.out.println(issueCount);
        // Печатаем значение переменной
    }
    public static int sum(int[] numbers) {
// Создаем метод и объявляем массив
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        // Считаем сумму элементов массива с помощью цикла
        return sum;
        // Возвращаем значение суммы в метод main
    }

    public static void main (String[]args){
            int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
            printSeparator();
            // Вызываем объявленный ранее метод
            for (int i = 0; i < issuesByMonths.length; i++) {
                                printIssues(issuesByMonths[i]);
                if ((i + 1) % 3 == 0) {
                    printSeparator();
                    // Вызываем объявленный ранее метод
                }
            }
        printSeparator();
        int total = sum(issuesByMonths);
        // Передаем значение внутри метода sum()
        printIssues(total);
        // Печатаем значение переменной total
        }
    }


