public class Cat {

    private String name;
    private int appetite;
    private boolean isWellfed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isWellfed() {
        return isWellfed;
    }

    public void eat(Plate plate) {

        if(plate.getFoodQuantity() < appetite) {
            throw new ArithmeticException("В тарелке только " + plate.getFoodQuantity() + " eды");
        }else {
            System.out.println("Кот начал есть, съел " + appetite);
            plate.decreaseFood(appetite);
            isWellfed = true;
        }
    }

}