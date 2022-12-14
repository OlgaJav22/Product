package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        Passport number_1 = new Passport("55226", "Рогов", "Евгений", "Игоревич", LocalDate.now().minusYears(25));
        Passport number_2 = new Passport("888999", "Сидорова", "Валентина", "Петровна", LocalDate.now().minusYears(39));
        Passport number_3 = new Passport("55226", "Маслов", "Евгений", "Сергеевич", LocalDate.now().minusYears(26));
        passports.add(number_1);
        passports.add(number_2);
        passports.add(number_3);
        System.out.println(passports);
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
        passportList.add(number_3);
        System.out.println(passportList);
    }
}
