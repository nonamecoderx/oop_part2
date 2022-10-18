public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    Human(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        name = "Информация не указана";
        town = "Информация не указана";
        job = "Информация не указана";
    }

    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            System.out.println("Год рождения не может быть отрицательным");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        this.name = name;
        this.town = town;
        this.job = job;
    }
}
