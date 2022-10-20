public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human human2 = new Human(1992, "Аня", "Москва", "методист образовательных программ");
        Human human3 = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        Human human4 = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human human5 = new Human(2001, "Владимир", "Казань", "безработный");
        printInfo(human1);
        printInfo(human2);
        printInfo(human3);
        printInfo(human4);
        printInfo(human5);
    }
//dz2.1
    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Я работаю на должности " + human.job + ". Будем знакомы!");
    }
}