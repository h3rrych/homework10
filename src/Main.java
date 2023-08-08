public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 10");
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullname  = lastName +" " + firstName +" " + middleName;
        System.out.println(fullname);



    }
    public static void  task2(){
        System.out.println("Задача 2");
        String fullname  = "Ivanov Ivan Ivanovich";
        String fullnameUpper = fullname.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " +fullnameUpper);

    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullname = "Иванов Семён Семёнович";
        fullname = fullname.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника - " + fullname);
    }
}