public class Cat extends Animals{
    public static int countCat;
    public Cat() {
        countCat++;
    }
    @Override
    public void run(int distance) {
        if(distance <= 200) {
            System.out.println("Кот пробежал " + distance);
        } else {
            System.out.println("Кот не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не умеют плавать");
    }
}
