public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Max", 10), new Cat("Vasya", 20)};
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("Кот сыт? " + cats[i].isWellfed());
        }
        plate.info();
    }
}
