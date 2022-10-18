public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Максим";
        human1.town = "Минск";
        human1.yearOfBirth = 1987;
        Human human2 = new Human();
        human2.name = "Аня";
        human2.town = "Москва";
        human2.yearOfBirth = 1993;
        Human human3 = new Human();
        human3.name = "Катя";
        human3.town = "Калининград";
        human3.yearOfBirth = 1994;
        Human human4 = new Human();
        human4.name = "Артем";
        human4.town = "Москва";
        human4.yearOfBirth = 1995;
        System.out.println("Привет! Меня зовут " + human1.name + ". Я из города " + human1.town + ". Я родился в " + human1.yearOfBirth + " году.");
        System.out.println("Привет! Меня зовут " + human2.name + ". Я из города " + human2.town + ". Я родился в " + human2.yearOfBirth + " году.");
        System.out.println("Привет! Меня зовут " + human3.name + ". Я из города " + human3.town + ". Я родилась в " + human3.yearOfBirth + " году.");
        System.out.println("Привет! Меня зовут " + human4.name + ". Я из города " + human4.town + ". Я родился в " + human4.yearOfBirth + " году.");
    }
}