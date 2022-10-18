public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            System.out.println("Год рождения не может быть отрицательным");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name.isEmpty() ){
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town.isEmpty() ){
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job.isEmpty() ){
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }
}
