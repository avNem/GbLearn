public class Dog extends Animals{
    public static int countDog;
    public Dog() {
        countDog++;
    }

    @Override
    public void run(int distance) {
        if(distance <= 500) {
            System.out.println("Собака пробежала " + distance);
        } else {
            System.out.println("Собака не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= 10) {
            System.out.println("Собака проплыла " + distance);
        } else {
            System.out.println("Собака не может столько проплыть");
        }
    }
}
