public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    private static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        System.out.println();
    }

    private static void task2() {
        String fullName = ("Ivanov Ivan Ivanovich");
        fullName = new String(new char[]{'I', 'V', 'A', 'N', 'O', 'V', ' ', 'I', 'V', 'A', 'N', ' ', 'I', 'V', 'A', 'N', 'O', 'V', 'I', 'C', 'H'});
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName);
        System.out.println();
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}
