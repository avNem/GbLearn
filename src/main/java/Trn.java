public class Trn {
    public static void main(String[] args) {
        Dog doq1 = new Dog();
        Dog doq2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        doq1.run(10);
        doq2.swim(5);
        cat1.run(12);
        cat2.run(23);
        cat3.swim(1);

        System.out.println(Cat.countCat);
        System.out.println(Dog.countDog);
    }
}
