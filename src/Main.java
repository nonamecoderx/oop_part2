public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(1987,"Максим", "Минск", "бренд-менеджер");
        Human human2 = new Human(1993,"Аня","Москва","методист образовательных программ");
        Human human3 = new Human(1994,"Катя","Калининград","продакт-менеджер");
        Human human4 = new Human(1995,"Артем","Москва","директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + human1.name + ". Я из города " + human1.town + ". Я родился в " + human1.yearOfBirth + " году. Я работаю на должности " + human1.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.name + ". Я из города " + human2.town + ". Я родилась в " + human2.yearOfBirth + " году. Я работаю на должности " + human2.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.name + ". Я из города " + human3.town + ". Я родилась в " + human3.yearOfBirth + " году. Я работаю на должности " + human3.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human4.name + ". Я из города " + human4.town + ". Я родился в " + human4.yearOfBirth + " году. Я работаю на должности " + human4.job + ". Будем знакомы!");
    }
}