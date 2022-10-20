public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String job;


    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}

