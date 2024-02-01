package Seminar5;
/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Main {

    public static void main(String[] args) {
        
        Passpotrs passpotrs = new Passpotrs();
        passpotrs.add("123456", "Иванов");
        passpotrs.add("321456", "Васильев");
        passpotrs.add("234561", "Петрова");
        passpotrs.add("234432", "Иванов");
        passpotrs.add("654321", "Петрова");
        passpotrs.add("345678", "Иванов");

        System.out.println(passpotrs);
        System.out.println(passpotrs.findByName("Иванов"));
    }
}