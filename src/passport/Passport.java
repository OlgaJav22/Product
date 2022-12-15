package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final String number;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthDay;


    public Passport(String number, String surname, String name, String patronymic, LocalDate birthDay) {
        if (number != null && !number.isBlank() && !number.isEmpty()) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Заполните номер паспорта");
        }
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните имя");
        }
        if (surname != null && !surname.isBlank() && !surname.isEmpty()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Заполните фамилию");
        }
        this.patronymic = patronymic;
        this.birthDay = birthDay;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return number + "; " + surname + " " + name + " " + patronymic + " " + birthDay;
    }
}



