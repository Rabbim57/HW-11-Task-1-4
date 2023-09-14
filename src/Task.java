import java.time.LocalDate;

public class Task {
    // task 1
    public static void main(String[] args){
        printIsLeapYear(2004);
        recommendApplicationVersion( 0 , 2025);
        printSetSystem( 2004, 0);
        System.out.println(calculateDeliveryDays(100));

    }
    private static void printIsLeapYearResult (int year, boolean yearIsLeap) {
        if (yearIsLeap){
            System.out.println(year + " високосный год ");
        }else {
            System.out.printf("Високосный %d ", year);
        }
    }
    public static void printIsLeapYear (int year){
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    private static boolean isLeap (int year) {
        return year % 4 == 0 && year % 100 !=0 || year % 400 == 0;

    }



    // task 2

    public static void recommendApplicationVersion(int clientOS, int deviceYear){

        boolean deviceIsOld = isDeviceOld (deviceYear);
        System.out.println("Устанновите ");
        if (deviceIsOld){
            System.out.println("Lite ");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        }else if (clientOS == 1){
            System.out.println("Android");
        }else{
            System.out.println("Неверное значение типа ОС");
        }

    }

    /**
     * Метод возврощает флаг старое устройство или нет
     * @param deviceYear год выпуска устройства
     * @return флаг, старое или нет
     */
    private static boolean isDeviceOld (int deviceYear){
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice){
        String version = " ";
        if ((clientDeviceYear < 2015)) {
            version = "облегченную";
        }
        String device = " ";
        if (clientDevice == 0) {
            device = "IOS";
        }else if (clientDevice == 1) {
            device = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", version, device);
        System.out.println("");
    }

    // task3
    public static String calculateDeliveryDays (int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20 ) {
            deliveryDays++;
        }
        if (deliveryDistance >60 && deliveryDistance <=100 ) {
            deliveryDays++;
        }else if (deliveryDistance >100) {
            return "Не возможно расчитать срок доставки";
        }
        return "Потребуется дней " + deliveryDays;

    }

}
