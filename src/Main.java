public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Максим";
        human1.town = "Минск";
        human1.yearOfBirth = 1987;
        human1.job = "бренд-менеджер";
        Human human2 = new Human();
        human2.name = "Аня";
        human2.town = "Москва";
        human2.yearOfBirth = 1993;
        human2.job = "методист образовательных программ";
        Human human3 = new Human();
        human3.name = "Катя";
        human3.town = "Калининград";
        human3.yearOfBirth = 1994;
        human3.job = "продакт-менеджер";
        Human human4 = new Human();
        human4.name = "Артем";
        human4.town = "Москва";
        human4.yearOfBirth = 1995;
        human4.job = "директор по развитию бизнеса";
        System.out.println("Привет! Меня зовут " + human1.name + ". Я из города " + human1.town + ". Я родился в " + human1.yearOfBirth + " году. Я работаю на должности " + human1.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.name + ". Я из города " + human2.town + ". Я родилась в " + human2.yearOfBirth + " году. Я работаю на должности " + human2.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.name + ". Я из города " + human3.town + ". Я родилась в " + human3.yearOfBirth + " году. Я работаю на должности " + human3.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human4.name + ". Я из города " + human4.town + ". Я родился в " + human4.yearOfBirth + " году. Я работаю на должности " + human4.job + ". Будем знакомы!");
    }
}